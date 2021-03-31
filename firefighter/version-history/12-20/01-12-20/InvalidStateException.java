package io.github.ethankelly;

/**
 * Used to throw invalid state exception
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */
public final class InvalidStateException extends Exception {
    public InvalidStateException() {
    }

    public InvalidStateException(String msg) {
        super(msg);
    }
}