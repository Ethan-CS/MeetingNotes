package io.github.ethankelly;

/**
 * Used to throw invalid state exception
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */


/**
 * Gives exception to throw if some State is invalid
 */
public final class InvalidStateException extends Exception {
    public InvalidStateException() {
    }

    public InvalidStateException(String msg) {
        super(msg);
    }
}