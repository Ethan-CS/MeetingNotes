package io.github.ethankelly;

public class InvalidCardSuitException extends Exception {

    private char suitIdentifier = '?';

    public InvalidCardSuitException(char invalidSuit) {

        suitIdentifier = invalidSuit;

        System.out.println("Invalid suit" + " " + invalidSuit);
    }

    private InvalidCardSuitException() {
        System.out.println("Invalid suit");
    }

    public String toString() {

        return ("Attempted to create card with invalid suit argument" + " " + this.suitIdentifier);

    }

    public char getSuitDesignator() {

        return suitIdentifier;
    }
}