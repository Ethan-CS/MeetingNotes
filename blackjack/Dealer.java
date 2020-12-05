package io.github.ethankelly;

import java.io.Serializable;

/**
 * Represents a dealer in Blackjack
 */

public class Dealer implements Serializable {

    private final Hand hand = new Hand();

    // Determines if dealer has a blackjack
    public boolean isBlackjack() {
		return hand.calculateTotal() == 21;
    }

    // This automates the dealer's play
    public void dealerPlay(Deck deck) {
        System.out.println();
        while (hand.calculateTotal() <= 16) {
            System.out.println("Dealer has " + hand.calculateTotal() + " and hits");
            hand.addCard(deck.nextCard());
            System.out.println("Dealer " + this.getHandString(true, false));
        }
        if (hand.calculateTotal() > 21) {
            System.out.println("Dealer busts. " + this.getHandString(true, false));
        } else {
            System.out.println("Dealer stands. " + this.getHandString(true, false));
        }
    }

    // Adds a card to the dealer's hand
    public void addCard(Card card) {
        hand.addCard(card);
    }

    // Gets the dealer's hand as a string
    public String getHandString(boolean isDealer, boolean hideHoleCard) {
        return "Cards:" + hand.toString(isDealer, hideHoleCard);
    }

    // Calculates the dealer's hand total
    public int calculateTotal() {
        return hand.calculateTotal();
    }

    // Clears the dealer's hand
    public void clearHand() {
        hand.clearHand();
    }

    // Peeks the dealer's face-down card
    public boolean peek() {
        return hand.dealerPeek();
    }
}