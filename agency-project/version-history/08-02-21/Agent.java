package io.github.ethankelly;


/**
 * Agency is the basis and purpose of the model we are developing. Each agent has certain attributes that need to be
 * determined initially and updated at each time-step in the model, which are:
 * <ul>
 *     <li> The vertex the agent is located at
 *     <li> The peril rating, based on the agent's proximity to infected vertices
 *     <li> The protection rating, which is partially random but increases with peril
 *     <li> The state of the vertex - whether it is susceptible to infection, infected, recovered or defended.
 * </ul>
 *
 * <p>
 *     Each agent's attributes are based on the initial state of the graph. In the model,
 *     we choose at random an initial vertex to be the 'setOutbreak' or source node. At time 0,
 *     only the source node is infected and all others are susceptible or protected, if
 *     there is no path between them and the source node for instance. An agent can
 *     transition to the protected state by having a protection rating of 1, which happens
 *     in different ways depending on context, such as via influence exerted or because the
 *     peril rating is also high and the baseline random protection was fairly high to begin with.
 *     At each time-step, we need to determine any changes to state, protection and peril.
 * </p>
 *
 * @author <a href="mailto:e.kelly.1@research.gla.ac.uk">Ethan Kelly</a>
 */
public class Agent {
    private final int vertex;
    private double peril;
    private double protection;
    private State state;

    /**
     * Class constructor.
     *
     * @param vertex     the vertex position (location) of the agent.
     * @param peril      the initial peril rating of the agent (based on proximity to fire).
     * @param protection the initial protection rating of the agent (partially random, increases with peril).
     * @param state      the initial state of the agent.
     */
    public Agent(int vertex, double peril, double protection, State state) {
        this.vertex = vertex;
        this.peril = peril;
        this.protection = protection;
        this.state = state;
    }

    /**
     * The vertex attribute of an agent indicates their location on the graph that the model uses. This, in turn, helps
     * determine which other agents (vertices) they are connected to, which may indicate a possible route of infection.
     *
     * @return the vertex location of the agent.
     */
    public int getVertex() {
        return vertex;
    }

    /**
     * An agent's peril rating represents the danger they are currently in. The more infected vertices within a certain
     * proximity, and the closer infected vertices are to the given agent, the higher the peril rating. Peril is zero if
     * there is no path between the vertex and an infected agent, in which case they are placed into the protected
     * state. Peril is one if the agent is in immediate danger, i.e. one of their directly adjacent neighbours is
     * infected.
     *
     * @return the current peril rating of the agent.
     */
    public double getPeril() {
        return peril;
    }

    /**
     * We assign the peril rating of the agent based on the current graph state (as determined in the main model class)
     * - specifically, the agent's proximity to infected vertices.
     *
     * @param peril the peril rating to be set to the current vertex.
     */
    public void setPeril(double peril) {
        this.peril = peril;
    }

    /**
     * The protection rating of an agent is based on a baseline random real number, between 0 and 1, and the peril. As
     * peril increases, protection increases - simulating an agent becoming more concerned as more agents close to them
     * contract the infection, thereby adopting more protective behaviours and increasing their overall protection
     * rating. The protection rating is also updated when we deploy a defensive move in the model, and the higher the
     * defence rating the smaller the likelihood of the agent contracting the contagion.
     *
     * @return the protection rating of the current agent.
     */
    public double getProtection() {
        return protection;
    }

    /**
     * Several methods update the method, whenever the peril has been updated (i.e. the state of the graph has changed
     * in some way, peril may have changed and so protection also needs to be updated and set to its new value). We do
     * not allow a protection of rating over 1, so this method prevents the value being set from being greater than
     * that.
     *
     * @param protection the new protection to be assigned to the current agent.
     */
    public void setProtection(double protection) {
        this.protection = protection > 1 ? 1 : protection;
    }

    /**
     * Each agent can be in one of a number of states, namely any of those in the State enum. These indicate which
     * compartment of the SIR model the agent belongs to and each has an associated value to make computation simpler
     * when updating the graph state and so on.
     *
     * @return the state to which the current agent belongs.
     */
    public State getState() {
        return state;
    }

    /**
     * For methods that update the state of the graph, they may have to update the state or states of certain agents.
     * For instance, if an agent has been defended so that their protection rating is now 1.0, they are moved to the
     * protected state.
     *
     * @param state the state into which we want to move the current agent.
     */
    public void setState(State state) {
        this.state = state;
    }


    /**
     * Returns a textual representation of the agent, detailing its vertex location, peril rating, protection rating and
     * current state. This is used to print to the console.
     *
     * @return a string representation of the agent.
     */
    @Override
    public String toString() {
        return "Agent at vertex " + this.getVertex()
                + ": peril " + String.format("%.2f", this.getPeril())
                + ", protection " + String.format("%.2f", this.getProtection())
                + " and state " + this.getState() + ".";
    }
}
