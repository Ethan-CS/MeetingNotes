package io.github.ethankelly;

import java.io.Serializable;

public class Player implements Serializable {

    private int bank;
    private int bet;
    private String name;
    private final Hand hand;

    // Creates a player object
    public Player() {
        bank = 100;
        hand = new Hand();

    }

    // Gets a player's bank amount
    public int getBank() {
        return bank;
    }

    // Removes a player's bet from their bank if they bust. Sets bet to zero afterwards.
    public void bust() {
        bank -= bet;
        bet = 0;
    }

    // Adds a player's bet from their bank if they win. Sets bet to zero afterwards.
    public void win() {
        bank += bet;
        bet = 0;
    }

    // Removes a player's bet from their bank if they lose. Sets bet to zero afterwards.
    public void loss() {
        bank -= bet;
        bet = 0;
    }

    // Sets the player bank to -1, which is out of bounds meaning they are removed from the game
    public void removeFromGame() {
        bank = -1;
    }

    // Resets the bank to 0, generally from -1 to play again
    public void resetBank() {
        bank = 0;
    }

    // Calculate the bet for a player who has a Blackjack
    public void blackjack() {
        bank += bet * 1.5;
        bet = 0;
    }

    // Sets a player's bet to 0 if they "push". No bet is added or removed.
    public void push() {
        bet = 0;
    }

    // Gets a player's name
    public String getName() {
        return name;
    }

    // Sets a player's name
    public void setName(String name1) {
        name = name1;
    }

    // Gets a player's hand total
    public int getTotal() {
        return hand.calculateTotal();
    }

    // Gets a player's bet
    public int getBet() {
        return this.bet;
    }

    // Sets a player's bet
    public void setBet(int newBet) {
        bet = newBet;
    }

    // Adds a card to a player's hand
    public void addCard(Card card) {
        hand.addCard(card);
    }

    // Gets the player's cards to print as a string
    public String getHandString() {
        return "Cards:" + hand.toString();
    }

    // Clears a player's hand
    public void clearHand() {
        hand.clearHand();
    }

}