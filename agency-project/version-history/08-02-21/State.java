package io.github.ethankelly;


/**
 * Represents the states that an agent can be in, which are:
 * <ul>
 *     <li> {@link #SUSCEPTIBLE} - the agent may contract the disease (i.e. with non-zero probability).
 *     <li> {@link #INFECTED} - has been exposed and successfully infected by the contagion.
 *     <li> {@link #RECOVERED} - previously had the disease, has since recovered and is no longer infectious.
 *     <li> {@link #PROTECTED} - an agent in this state cannot become infected.
 * </ul>
 *
 * @author <a href="mailto:e.kelly.1@research.gla.ac.uk">Ethan Kelly</a>
 */
public enum State {
    /**
     * Susceptible state
     */
    SUSCEPTIBLE(0),
    /**
     * Infected state
     */
    INFECTED(1),
    /**
     * Recovered state
     */
    RECOVERED(2),
    /**
     * Protected (defended) state
     */
    PROTECTED(3);

    /**
     * Class constructor, used to associate the inputted value with a given state.
     */
    private final int value;

    State(int value) {
        this.value = value;
    }

    /**
     * Each state has a value associated to it, for ease of computation and storage of the graph state at each time
     * step. The value method returns the value associated to the state that it is called on.
     *
     * @return the value of the state.
     */
    public int value() {
        return this.value;
    }
}