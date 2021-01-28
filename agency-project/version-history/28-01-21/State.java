package io.github.ethankelly;

/**
 * Represents the states that an agent can be in, which are:
 * <ul>
 *     <li> {@link #SUSCEPTIBLE} - the agent may contract the disease (i.e. with non-zero probability).
 *     <li> {@link #INFECTED} - has been exposed and successfully infected by the contagion.
 *     <li> {@link #RECOVERED} - previously had the disease, has since recovered and is no longer infectious.
 *     <li> {@link #PROTECTED} - an agent in this state cannot become infected.
 * </ul>
 */
public enum State {
    /**
     * Susceptible state
     */
    SUSCEPTIBLE,
    /**
     * Infected state
     */
    INFECTED,
    /**
     * Recovered state
     */
    RECOVERED,
    /**
     * Protected (or defended) state
     */
    PROTECTED
}