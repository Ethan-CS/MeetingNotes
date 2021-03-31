
package io.github.ethankelly;

public final class InvalidTurnCountException extends Exception {
    public InvalidTurnCountException() {

    }

    public InvalidTurnCountException(String msg) {
        super(msg);
    }
}