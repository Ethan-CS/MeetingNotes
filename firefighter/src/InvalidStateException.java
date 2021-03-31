
package io.github.ethankelly;

/**
 * Used to throw invalid state exception
 *
 * @author ethankelly
 */
public final class InvalidStateException extends Exception {
    public InvalidStateException() {
    }

    public InvalidStateException(String msg) {
        super(msg);
    }
}