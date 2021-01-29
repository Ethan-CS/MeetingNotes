package io.github.ethankelly;

import java.util.Arrays;

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
    private static int numVertices;
    private static int[][] graphState;

    /**
     * Class constructor.
     *
     * @param numVertices the number of vertices in the graph used in the model.
     * @param source the outbreak vertex - the first agent to become infected.
     */
    public ModelState(int numVertices, int source) {
        ModelState.numVertices = numVertices;
        graphState = initialState(numVertices, source);
    }

    /**
     * Given the current state of the graph, the choice of defence and the current turn count,
     * Sets the selected vertex/vertices to 'protected' from now on.
     *
     * @param state the state of the model so far.
     * @param defend the vertex (aim: vertices) to defend (aim: and by how much).
     * @param turnCount the current turn count of the model.
     * @return the updated state with new protections in most recent turn.
     */
    public static int[][] updateStateDefence(int[][] state, int defend, int turnCount) {
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
        for (int k = turnCount; k <= turnCount; k++) {
            // Only update what has been defended
            updated[defend][k] = (State.PROTECTED).value();
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

    //TODO public static int[][] updateState(int[][] state, int turnCount) {calls burn or defence based on turn count}

    /**
     * The state of the model is currently stored as a 2d int array. This is a private class attribute which can only
     * be updated by methods in this class.
     *
     * @return The current 2d array representation of the model (which vertices are susceptible, infected and so on)
     */
    public static int[][] getGraphState() {
        return ModelState.graphState;
    }

    /**
     * Returns an array of any vertices currently infected (on fire) in the model.
     *
     * @return array of vertex positions of any infected agents
     */
    public static int[] getFires() {
        int[][] state = getGraphState();
        int currentRound = state[0].length;

        int[] vertexSet = new int[state.length];
        for (int i = 0; i < vertexSet.length; ++i) vertexSet[i] = i;

        int[] onFire = new int[vertexSet.length];
        int k = 0, i = 0;

        while (i < vertexSet.length) {
            if (state[i][currentRound-1] == (State.INFECTED).value()) {
                onFire[k++] = vertexSet[i];
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
     * @param outbreak the location of the source node of the contagion
     * @return the initialised state of the model, a 2d array (height: number of vertices, width: 1)
     */
    private int[][] initialState(int numVertices, int outbreak) {
        int[][] state = new int[numVertices][1];
        // Initialise with outbreak at t=0 -> INFECTED, everything else SUSCEPTIBLE
        state[outbreak][0] = State.INFECTED.value();

        return state;
    }

    /**
     * Given the current state of the model and the turn count, determines the vertices that become infected.
     *
     * @param state the state of the model up to the current time step.
     * @param turnCount the current turn count we're trying to progress infection in.
     * @return The vertices that are currently burning.
     */
    public boolean[] burn(int[][] state, int turnCount) {
        boolean[] burningVertices = new boolean[getNumVertices()];
        // Value of 1 if vertex (index) is burning, 0 otherwise (defended or open)
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                // Store any vertices already on fire
                if (state[i][turnCount - 1] == State.INFECTED.value()) {
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
     * @param state the current state of the model, up until current burning has taken place.
     * @param toBurn the vertices that will contract the infection (toBurn[i] is true if i is infected, false otherwise).
     * @return the updated state of the graph, with what is currently burning added in a new column.
     */
    public int[][] updateStateBurning(int[][] state, boolean[] toBurn) {
        int turnCount = state[0].length + 1;
        int[][] updated = new int[numVertices][turnCount + 1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < turnCount; j++) {
                updated[i][j] = state[i][j];
                updated[i][j + 1] = state[i][j];
            }
        }
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                // If something is previously burned or defended, ensure all following incidences also that state
                if (toBurn[i]) {
                    if (Graph.getEdge(i, j)) {
                        updated[j][turnCount] = State.INFECTED.value();
                    }
                }
            }
        }
        return updated;
    }

    /**
     * Given a 2d (rectangular) array, prints it to the console. This is used for testing purposes.
     *
     * @param matrix the 2d array to be printed to the standard output.
     */
    public void printMatrix(int[][] matrix) {
        // Loop through all rows
        for (int[] row : matrix)
            // Convert each row to string, then print (moving cursor down each time)
            System.out.println(Arrays.toString(row));
    }
}
