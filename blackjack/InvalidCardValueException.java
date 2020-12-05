package io.github.ethankelly;

public class InvalidCardValueException extends Exception {

    private int valueIdentifier = 0;

    public InvalidCardValueException(int invalidValue) {

        valueIdentifier = invalidValue;

        System.out.println("Invalid value " + invalidValue);
    }

    private InvalidCardValueException() {

        System.out.println("Invalid value");
    }

    public String toString() {

        return ("Attempted to create card with invalid suit argument" + " " + this.valueIdentifier);
    }

    public int getValue() {

        return valueIdentifier;
    }
}