package io.github.ethankelly;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Plays a game of Blackjack
 */

public class BlackjackGame {

    private final Scanner ki = new Scanner(in);
    private int users;
    private Player[] players;
    private Deck deck;
    private final Dealer dealer = new Dealer();

    // Starts game and displays the rules
    public void initializeGame() {
        String names;

        // Gets the number of players and creates them
        out.print("How many people are playing (1-6)? ");
        users = ki.nextInt();

        // Gives player another chance to enter number of players if less than 1 or more than 6
        while (users > 6 || users < 0) {
            out.print("How many people are playing (1-6)? ");
            users = ki.nextInt();
        }

        players = new Player[users];
        deck = Deck.getInstance();

        // Asks for player names and assigns them
        for (int i = 0; i < users; i++) {
            out.print("What is player " + (i + 1) + "'s name? ");
            names = ki.next();
            players[i] = new Player();
            players[i].setName(names);
        }
    }

    // Shuffles the deck
    public void shuffle() throws InvalidDeckPositionException, InvalidCardSuitException, InvalidCardValueException {
        deck.shuffle();
    }

    // Gets the bets from the players
    public void getBets() {
        int betValue;

        for (int i = 0; i < users; i++) {
            if (players[i].getBank() > 0) {
                do {
                    out.print("How much do you want to bet " + players[i].getName() + (" (1-" + players[i].getBank()) + ")? ");
                    betValue = ki.nextInt();
                    players[i].setBet(betValue);
                } while (!(betValue > 0 && betValue <= players[i].getBank()));
                out.println();
            }
        }
    }

    // Deals the cards to the players and dealer
    public void dealCards() {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < users; i++) {
                if (players[i].getBank() > 0) {
                    players[i].addCard(deck.nextCard());
                }
            }

            dealer.addCard(deck.nextCard());
        }
    }

    // Initial check for dealer or player Blackjack
    public void checkBlackjack() {
        //System.out.println();

        if (dealer.isBlackjack()) {
            out.println("Dealer has BlackJack!");
            for (int i = 0; i < users; i++) {
                if (players[i].getTotal() == 21) {
                    out.println(players[i].getName() + " pushes");
                    players[i].push();
                } else {
                    out.println(players[i].getName() + " loses");
                    players[i].bust();
                }
            }
        } else {
            if (dealer.peek()) {
                out.println("Dealer peeks and does not have a Blackjack");
            }

            for (int i = 0; i < users; i++) {
                if (players[i].getTotal() == 21) {
                    out.println(players[i].getName() + " has blackjack!");
                    players[i].blackjack();
                }
            }
        }
    }

    // This code takes the user commands to hit or stand
    public void hitOrStand() {
        String command;
        char c;
        for (int i = 0; i < users; i++) {
            if (players[i].getBet() > 0) {
                out.println();
                out.println(players[i].getName() + " has " + players[i].getHandString());

                do {
                    do {
                        out.print(players[i].getName() + " (T)wist or (S)tick? ");
                        command = ki.next();
                        c = command.toUpperCase().charAt(0);
                    } while (!(c == 'T' || c == 'S'));
                    if (c == 'T') {
                        players[i].addCard(deck.nextCard());
                        out.println(players[i].getName() + " has " + players[i].getHandString());
                    }
                } while (c != 'S' && players[i].getTotal() <= 21);
            }
        }
    }

    // Code for the dealer to play
    public void dealerPlays() {
        boolean isSomePlayerStillInTheGame = false;
        for (int i = 0; i < users && !isSomePlayerStillInTheGame; i++) {
            if (players[i].getBet() > 0 && players[i].getTotal() <= 21) {
                isSomePlayerStillInTheGame = true;
            }
        }
        if (isSomePlayerStillInTheGame) {
            dealer.dealerPlay(deck);
        }
    }

    // Calculate all possible outcomes and add/remove player bets as appropriate
    public void settleBets() {
        out.println();

        for (int i = 0; i < users; i++) {
            if (players[i].getBet() > 0) {
                if (players[i].getTotal() > 21) {
                    out.println(players[i].getName() + " has busted");
                    players[i].bust();
                } else if (players[i].getTotal() == dealer.calculateTotal()) {
                    out.println(players[i].getName() + " has pushed");
                    players[i].push();
                } else if (players[i].getTotal() < dealer.calculateTotal() && dealer.calculateTotal() <= 21) {
                    out.println(players[i].getName() + " has lost");
                    players[i].loss();
                } else if (players[i].getTotal() == 21) {
                    out.println(players[i].getName() + " has won with blackjack!");
                    players[i].blackjack();
                } else {
                    out.println(players[i].getName() + " has won");
                    players[i].win();
                }
            }
        }
    }

    // Print player hands
    public void printStatus() {
        for (int i = 0; i < users; i++) {
            if (players[i].getBank() > 0) {
                out.println(players[i].getName() + " has " + players[i].getHandString());
            }
        }
        out.println("Dealer has " + dealer.getHandString(true, true));
    }

    // Print the banks and tell player if they are out of the game
    public void printMoney() {
        for (int i = 0; i < users; i++) {
            if (players[i].getBank() > 0) {
                out.println(players[i].getName() + " has " + players[i].getBank());
            }
            if (players[i].getBank() == 0) {
                out.println(players[i].getName() + " has " + players[i].getBank() + " and is out of the game.");
                players[i].removeFromGame();
            }
        }
    }

    // Reset all hands
    public void clearHands() {
        for (int i = 0; i < users; i++) {
            players[i].clearHand();
        }
        dealer.clearHand();
    }

    // Force the game to end when either all players lose or players choose to keep playing or not
    public boolean playAgain() {
        String command;
        char c;
        boolean playState = true;
        if (forceEnd()) {
            playState = false;
        } else {
            do {
                // Give players choice to continue playing or not
                out.println();
                out.print("Do you want to play again (Y)es or (N)o? ");
                command = ki.next();
                c = command.toUpperCase().charAt(0);
            } while (!(c == 'Y' || c == 'N'));
            if (c == 'N') {
                playState = false;
            }
        }
        return playState;
    }

    // True or false to forcing the game to end
    public boolean forceEnd() {
        boolean end = false;
        int endCount = 0;

        for (int i = 0; i < users; i++) {
            if (players[i].getBank() == -1) {
                endCount++;
            }
        }
        if (endCount == users) {
            end = true;
        }
        if (end) {
            out.println();
            out.println("All players have lost and the game ends.");
        }

        return end;
    }

    /**
     * Endgame code for when all players are out or decide to stop playing
     */
    public void endGame() {
        int endAmount;
        String endState = " no change.";
        out.println();
        for (int i = 0; i < users; i++) {
            if (players[i].getBank() == -1) {
                players[i].resetBank();
            }
            endAmount = players[i].getBank() - 100;
            if (endAmount > 0) {
                endState = " gain of ";
            } else if (endAmount < 0) {
                endState = " loss of ";
            }
            out.println(players[i].getName() + " has ended the game with " + players[i].getBank() + ".");
            if (!endState.equals(" no change.")) {
                out.println("A" + endState + Math.abs(endAmount) + ".");
            } else {
                out.println("No change from their starting value.");
            }
            out.println();
        }
        out.println();
        out.println("Thanks for playing!");
    }
}
