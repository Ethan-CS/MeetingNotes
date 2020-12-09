package io.github.ethankelly;

import java.io.Serializable;
import java.util.Random;

/**
 * Represents a deck of playing cards
 */

public class Deck extends Exception implements Serializable {

    private static Card[] deck = new Card[52];
    private static int nextCardIndex;
    private static Deck ourInstance;  // a place where our _only_ instance will go

    private Deck() {


        // Initialise the deck
        int count = 0;
        try {
            for (int i = 1; i <= 13; i++) deck[count++] = new Card('H', i);
            for (int i = 1; i <= 13; i++) deck[count++] = new Card('S', i);
            for (int i = 1; i <= 13; i++) deck[count++] = new Card('C', i);
            for (int i = 1; i <= 13; i++) deck[count++] = new Card('D', i);
        } catch (InvalidCardValueException | InvalidCardSuitException exp1) {
            exp1.printStackTrace();
        }
        nextCardIndex = 0;
    }

    public static Deck getInstance() {

        // If we've never made an instance, make one and store it
        if (ourInstance == null) {
            ourInstance = new Deck();
        }

        // Return the only instance we ever made, rather than creating multiple
        return ourInstance;
    }

    private void isValidIndex(int index) throws InvalidDeckPositionException {
        if (index < 0 || index > 51) {
            throw new InvalidDeckPositionException(index);
        }
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

        for (Card card : deck) {
            str.append(card.toString()).append(" ");
        }
        return str.toString();
    }

    // Swaps two cards
    private void swapCards(int index1, int index2) throws InvalidDeckPositionException {
        Card hold;

        isValidIndex(index1);
        isValidIndex(index2);
        hold = deck[index1];
        deck[index1] = deck[index2];
        deck[index2] = hold;
    }

    // Shuffle the deck
    public void shuffle() throws InvalidDeckPositionException {
        Random rn = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < deck.length; j++) {
                swapCards(i, rn.nextInt(52));
            }
        }
        nextCardIndex = 0;
    }

    public Card getCard(int index) throws InvalidDeckPositionException {
        isValidIndex(index);
        return deck[index];
    }


    public boolean compareTo(Deck otherDeck) throws InvalidDeckPositionException {
        for (int i = 0; i < deck.length; i++) {
            if (!deck[i].compareTo(otherDeck.getCard(i))) {
                return false;
            }
        }
        return true;
    }

    public Card nextCard() {
        if (nextCardIndex < 0 || nextCardIndex > 51) {
            System.out.println("Future exception goes here");
        }
        return deck[nextCardIndex++];
    }
}
