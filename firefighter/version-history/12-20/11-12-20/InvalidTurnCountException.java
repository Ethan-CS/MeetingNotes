package io.github.ethankelly;

/**
 * Used to throw invalid turn count exception,
 * recall odd numbers are defensive turns and even are burning turns.
 *
 * @author ethankelly <e.kelly.1@research.gla.ac.uk></e.kelly.1@research.gla.ac.uk>
 */

public final class InvalidTurnCountException extends Exception {
    private int turnCount;

    public InvalidTurnCountException(int turnCount) {
        this.turnCount = turnCount;
    }

    public int getTurnCount() {
        return turnCount;
    }

    public InvalidTurnCountException(String msg) {
        super(msg);
    }
}