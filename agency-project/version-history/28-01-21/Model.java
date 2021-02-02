package io.github.ethankelly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.github.ethankelly.Model.printSIRP;

/**
 * The model state contains all methods involved in storing and updating the state of
 * play. For instance, a method for getting the currently burning vertices
 * (based on a given probability of propagation) and for updating the state (stored as a matrix)
 * of the graph. This matrix keeping information about how the contagion has progressed
 * and begins with one column of all zeros, where each row represents the vertex
 * corresponding to the row index. Another column will represent a defensive move - if
 * any vertices have been influenced to the level required to deem them immune to the
 * disease (perhaps by a vaccine), then they move to the protected state. Then, another
 * column is added to represent any transmissions that occur based on the probability of
 * transmission and the protection rating of the agents the contagion is currently
 * adjacent to. Then, another defence turn is played and so on, until no more moves can
 * be made. This class needs to contain methods that check for this instance after every
 * turn and thereby end the simulation. The methods here are used to pass probabilities which
 * dictate infection dynamics, depending on the particular context we want to consider.
 *
 * @author Ethan Kelly
 */

public class ModelState {
    private static final int numVertices = 9;
    private static int[][] graphState = initialState(numVertices);
    private static List<Agent> agents;

    /**
     * Given the current state of the graph, the choice of defence and the current turn count,
     * Sets the selected vertex/vertices to 'protected' from now on.
     *
     * @param state     the state of the model so far.
     * @param defend    the vertex (aim: vertices) to defend (aim: and by how much).
     * @param turnCount the current turn count of the model.
     * @return the updated state with new protections in most recent turn.
     */
    public static int[][] updateStateDefence(int[][] state, double[] defend, int turnCount) {
        // TODO This needs to be able to increase protection rating by a given amount for one or more agent(s)
        int[][] updated = new int[numVertices][turnCount + 1];

        int i = 0, j = 0;
        while (i < numVertices) {
            while (j < turnCount) {
                updated[i][j] = state[i][j];
                updated[i][j + 1] = state[i][j];
                j++;
            }
            i++;
        }
        for (int l = 0; l < defend.length; l++) {
            // If the increase in protection is enough to stop infection, then set to protected
            if (defend[l]+getAgents().get(l).getProtection() >= 1) {
                getAgents().get(l).setPeril(0);
                getAgents().get(l).setProtection(1);
                getAgents().get(l).setState(State.PROTECTED);
                updated[l][turnCount] = (State.PROTECTED).value();
            } else {
                getAgents().get(l).setProtection(getAgents().get(l).getProtection() + defend[l]);
            }

        }
        return updated;
    }

    /**
     * The number of vertices represents the total number of agents in the mode. This doesn't say anything about
     * How they are connected, just how many there are.
     *
     * @return the number of vertices in the model.
     */
    public static int getNumVertices() {
        return numVertices;
    }

    public static void updateState() {// Calls burn or defence based on turn count
        int[][] state = getGraphState();
        int turnCount = state[0].length;
        int[][] newState;
        double[] defend = determineDefence(state);// TODO maybe don't need turn count?

        if (turnCount == 0) {
            newState = initialState(getNumVertices());
        } else if (turnCount % 2 == 0) {
            newState = updateStateBurning(state, burn(state, turnCount));
        } else {
            newState = updateStateDefence(state, defend, turnCount);
        }
        graphState = newState;
    }

    private static double[] determineDefence(int[][] state) {
        double[] toDefend = new double[state.length]; // Each double is the decimal amount to increase protection by.
        // TODO how do we determine defensive strategy?
        Arrays.fill(toDefend, 0.5);
        return toDefend;
    }

    /**
     * The state of the model is currently stored as a 2d int array. This is a private class attribute which can only
     * be updated by methods in this class.
     *
     * @return The current 2d array representation of the model (which vertices are susceptible, infected and so on)
     */
    public static int[][] getGraphState() {
        return graphState;
    }

    /**
     * Returns an array of any vertices currently infected (on fire) in the model.
     *
     * @return array of vertex positions of any infected agents
     */
    public static int[] getFires() {

        int[] onFire = new int[getNumVertices()];
        int k = 0, i = 0;

        while (i < getNumVertices()) {
            if (getAgents().get(i).getState() == (State.INFECTED)) {
                onFire[k++] = i;
            }
            i++;
        }
        return Arrays.copyOf(onFire, k);
    }

    /**
     * Given the number of vertices and the source node of the contagion, we create a new 2d array to begin storing
     * information about the state of the model. At initialisation, it will only have one column (turn count 0).
     *
     * @param numVertices the number of agents (vertices) in the model (graph)
     * @return the initialised state of the model, a 2d array (height: number of vertices, width: 1)
     */
    private static int[][] initialState(int numVertices) {
        int[][] state = new int[numVertices][1];
        // Initialise with setOutbreak at t=0 -> INFECTED, everything else SUSCEPTIBLE/PROTECTED
//        state[outbreak][0] = State.INFECTED.value();
        List<Agent> agents = getAgents();
//        for (int i = 0; i < agents.size(); i++) {
//                state[i][0] = agents.get(i).getState().value();
//        }
        for (int i = 0; i < agents.size(); i++) {
            switch (agents.get(i).getState()) {
                case SUSCEPTIBLE -> state[i][0] = State.SUSCEPTIBLE.value();
                case INFECTED -> state[i][0] = State.INFECTED.value();
                case RECOVERED -> state[i][0] = State.RECOVERED.value();
                case PROTECTED -> state[i][0] = State.PROTECTED.value();
            }
        }
        return state;
    }

    /**
     * Given the current state of the model and the turn count, determines the vertices that become infected.
     *
     * @param state     the state of the model up to the current time step.
     * @param turnCount the current turn count we're trying to progress infection in.
     * @return The vertices that are currently burning.
     */
    public static boolean[] burn(int[][] state, int turnCount) {
        boolean[] burningVertices = new boolean[getNumVertices()];
        // Value of 1 if vertex (index) is burning, 0 otherwise (defended or open)
        for (int i = 0; i < getNumVertices(); i++) {
            for (int j = 0; j < getNumVertices(); j++) {
                // Store any vertices already on fire
                if (getAgents().get(i).getState() == State.INFECTED) {
                    burningVertices[i] = true;
                    // Open neighbours of burning vertices catch fire
                    // TODO this needs to include some way of deciding whether something contracts based on a variable probability of transmission.
                    if (state[j][turnCount - 1] == 0 && Graph.getEdge(i, j)) {
                        burningVertices[j] = true;
                    }
                }
            }
        }
        // Array containing vertices burning last round,
        // Used to check if the contagion has been contained
        boolean[] previouslyBurning = new boolean[numVertices];
        for (int k = 0; k < numVertices; k++) {
            if (state[k][turnCount - 1] == State.INFECTED.value()) {
                previouslyBurning[k] = true;
            }
        }
        // If we haven't burned anything new, fire cannot spread, end game
        // Flag if nothing can burn
        if (Arrays.equals(burningVertices, previouslyBurning)) {
            // TODO flag that the fire cannot spread
        }
        return burningVertices;
    }

    /**
     * Given the current state of the model and some vertices to burn, as well as the current turn count, returns
     * an updated array for the new state of the matrix (with the new burning vertices)
     *
     * @param state  the current state of the model, up until current burning has taken place.
     * @param toBurn the vertices that will contract the infection (toBurn[i] is true if i is infected, false otherwise).
     * @return the updated state of the graph, with what is currently burning added in a new column.
     */
    public static int[][] updateStateBurning(int[][] state, boolean[] toBurn) {
        int turnCount = state[0].length + 1;
        int[][] updated = new int[numVertices][turnCount + 1];
        // Add columns from current state to the updated state
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updated[i][j] = state[i][j];
                updated[i][j + 1] = state[i][j];
            }
        }
        // Update new burning information
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                // If something is previously burned or defended, ensure all following incidences also that state
                if (toBurn[i] && Graph.getEdge(i, j)) {
                    updated[j][turnCount] = State.INFECTED.value();
                }
            }
        }
        return updated;
    }

    public static List<Agent> getAgents() {
        if (agents == null) {
            agents = setAgents();
        }
        return agents;
    }

    private static List<Agent> setAgents() {
        List<Agent> agents = new ArrayList<>();
        for (int i = 0; i < ModelState.getNumVertices(); i++) {
            agents.add(new Agent(i));
            System.out.println(agents.get(i).toString());
        }
        return agents;
    }

    public static int[] getSusceptible(List<Agent> agents) {
        int[] isSusceptible = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.SUSCEPTIBLE) {
                isSusceptible[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isSusceptible, k);
    }

    public static int[] getInfected(List<Agent> agents) {
        int[] isInfected = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.INFECTED) {
                isInfected[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isInfected, k);
    }

    public static int[] getRecovered(List<Agent> agents) {
        int[] isRecovered = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.RECOVERED) {
                isRecovered[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isRecovered, k);
    }

    public static int[] getProtected(List<Agent> agents) {
        int[] isProtected = new int[agents.size()];

        int k = 0;
        for (Agent agent : agents) {
            if (agent.getState() == State.PROTECTED) {
                isProtected[k++] = agents.indexOf(agent);
            }
        }
        return Arrays.copyOf(isProtected, k);
    }

    /**
     * Given a 2d (rectangular) array, prints it to the console. This is used for testing purposes.
     *
     * @param matrix the 2d array to be printed to the standard output.
     */
    public static void printMatrix(int[][] matrix) {
        // Loop through all rows
        for (int[] row : matrix)
            // Convert each row to string, then print (moving cursor down each time)
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        Graph g = new Graph(getNumVertices());
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(3, 7);
        g.addEdge(5, 8);
        g.addEdge(6, 7);
        System.out.println(g);

        List<Agent> agents = ModelState.getAgents();

        printSIRP(getAgents());
        printMatrix(getGraphState());
        updateState();
        printMatrix(getGraphState());
        printSIRP(agents);
    }
}
