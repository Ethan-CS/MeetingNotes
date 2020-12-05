package io.github.ethankelly;

import java.io.Serializable;

/**
 * Represents a playing card
 */

public class Card implements Serializable {

    // Making data "private" is information hiding, so that
    // it cannot be accessed with code outside this class.
    private final char suit;
    private final int value;

    private Card() {
        suit = ' ';
        value = 0;
    }

    public Card(char newSuit, int newValue) throws InvalidCardValueException, InvalidCardSuitException {
        if (newValue < 1 || newValue > 13) {
            throw new InvalidCardValueException(newValue);
        } else {
            this.value = newValue;
        }
        if (newSuit != 'H' && newSuit != 'S' && newSuit != 'D' && newSuit != 'C') {
            throw new InvalidCardSuitException(newSuit);
        } else {
            this.suit = newSuit;
        }

    }

    @Override
    public String toString() {

        return getSuitName() + " " + this.value;

    }

    public String getSuitName() {

        return switch (this.suit) {
            case 'H' -> "Hearts";
            case 'S' -> "Spades";
            case 'C' -> "Clubs";
            case 'D' -> "Diamonds";
            default -> "Unknown";
        };
    }

    public char getSuitDesignator() {
        return suit;
    }

    public String getValueName() {

        return switch (this.value) {
            case 1 -> "Ace";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "Unknown";
        };
    }

    /* Encapsulation: provides access to hidden information by
     * putting it together in one unit with a public method. So, anyone who wants
     * data will have to use a setter/getter.*/
    public int getValue() {
        return this.value;
    }

    public boolean compareSuit(Card card) {
        return this.suit == card.getSuitDesignator();
    }

    public boolean compareValue(Card card) {
        return this.value == card.getValue();
    }

    public boolean compareTo(Card card) {
        return this.suit == card.getSuitDesignator() && this.value == card.getValue();
    }
}