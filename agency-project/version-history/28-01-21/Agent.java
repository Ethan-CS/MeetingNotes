package io.github.ethankelly;

/**
 * Agency is the basis and purpose of the model we are developing. Each agent
 * has certain attributes that need to be determined initially and updated
 * at each time-step in the model, which are:
 * <ul>
 *     <li> The vertex the agent is located at
 *     <li> The peril rating, based on the agent's proximity to infected vertices
 *     <li> The protection rating, which is partially random but increases with peril
 *     <li> The state of the vertex - whether it is susceptible to infection, infected, recovered or defended.
 * </ul>
 *
 * <p>
 *     Each agent's attributes are based on the initial state of the graph. In the model,
 *     we choose at random an initial vertex to be the 'outbreak' or source node. At time 0,
 *     only the source node is infected and all others are susceptible or protected, if
 *     there is no path between them and the source node for instance. An agent can
 *     transition to the protected state by having a protection rating of 1, which happens
 *     in different ways depending on context, such as via influence exerted or because the
 *     peril rating is also high and the baseline random protection was fairly high to begin with.
 *     At each time-step, we need to determine any changes to state, protection and peril.
 * </p>
 *
 * @author Ethan Kelly
 *
 */

public class Agent {
    private final int vertex; // Index of agent in graph
    private final double peril; // Peril rating based on proximity to fire
    private final double protection; // Protection rating between 0 and 1
    private State state;

    /**
     * Class constructor.
     *
     * @param vertex - location of the agent
     */
    public Agent(int vertex) {
        this.vertex = vertex;
        this.peril = setPeril();
        this.protection = setProtection();
        this.state = setState(vertex);
    }

    /**
     * @return location of the agent in the graph
     */
    public int getVertex() {
        return vertex;
    }

    /**
     * @return protection rating of the agent
     */
    public double getProtection() {
        return protection;
    }

    /**
     * The protection rating is determined by multiplying a baseline (random) rate between 0 and 1
     * and the current peril rating - the higher the peril, the higher the protection rating.
     *
     * @return protection rating of the agent
     */
    private double setProtection() { // Based on some random baseline and proximity to fire
        double baseline = Math.random();
        double protection;
        double peril = getPeril();

        protection = peril == 0 ? baseline : baseline * getPeril();

        return protection;
    }

    /**
     * The peril rating is based on the proximity of an agent to infectious vertices. It is between 0
     * (where there are no accessible infected vertices) and 1 currently infected or directly adjacent to an infected vertex).
     *
     * @return peril rating
     */
    public double getPeril() {
        return peril;
    }

    /**
     * Peril is determined by finding the reciprocal of the shortest distance to the closest currently infected vertex
     * so a peril rating of 0 is no danger and 1 is immediate danger (or infection).
     *
     * @return the peril rating to set
     */
    private double setPeril() { // Using Dijkstra's Algorithm to find shortest distance
        int[] fires = ModelState.getFires();
        double peril;

            double tempDist;
            int[] leastDistancePath = Graph.shortestPath(vertex);
            double leastDist = leastDistancePath[fires[0]]; //TODO make this work for more than one fire location - find closest fire, find shortest path to it

            for (int i = 1; i < fires.length; i++) {
                tempDist = (Graph.shortestPath(fires[i])).length;
                if (tempDist < leastDist)
                    leastDist = tempDist;
            }
            if (leastDist == 0) peril = 1.0;
            else peril = leastDist == Integer.MAX_VALUE ? 0.0 : 1 / leastDist;

        return peril;
    }

    /**
     * @return the current state of the agent
     */
    public State getState() {
        return state;
    }

    /**
     * Each agent can be susceptible, infected or protected (at present). Susceptible means the agent is not
     * currently infected but could become infected, infected means they're currently infected and protected
     * means they cannot become infected (whether through defence or because there is no path to any infection on the graph.
     *
     * @param vertex the location of the vertex to set the state of
     * @return the state we determined the agent should be in
     */
    private State setState(int vertex) {

        int[] fires = ModelState.getFires();
        int[] defended = ModelState.getDefended();

        State toSet = State.SUSCEPTIBLE;

        for (int fire : fires) {
            if (fire == vertex) {
                toSet = State.INFECTED;
                break;
            }
        }
        for (int i : defended) {
            if (i == vertex || this.getPeril() == 0) {
                toSet = State.PROTECTED;
                break;
            }
        }
        this.state = toSet;
        return toSet;

    }

    /**
     * Returns a textual representation of the agent, detailing its vertex location, peril rating,
     * protection rating and current state. This is used to print to the console.
     *
     * @return a string representation of the agent.
     */
    @Override
    public String toString() {
        return "Agent at position " + getVertex()
                + " has peril rating " + getPeril()
                + ", protection rating " + getProtection()
                + " and is in state " + getState();
    }
}
