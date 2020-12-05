package io.github.ethankelly;

import java.io.*;

/**
 * Driver Class for Blackjack game
 */

public class Blackjack {

    public static void main(String[] args) throws Exception {

        BlackjackGame myGame = new BlackjackGame();

        myGame.initializeGame();
        myGame.shuffle();
        myGame.getBets();
        myGame.dealCards();
        myGame.printStatus();
        myGame.checkBlackjack();
        myGame.hitOrStand();
        myGame.dealerPlays();
        myGame.settleBets();
        myGame.printMoney();
        myGame.clearHands();
        while (myGame.playAgain()) {
            myGame.shuffle();
            myGame.getBets();
            myGame.dealCards();
            myGame.printStatus();
            myGame.checkBlackjack();
            myGame.hitOrStand();
            myGame.dealerPlays();
            myGame.settleBets();
            myGame.printMoney();
            myGame.clearHands();
        }
        myGame.endGame();

        try {
            FileOutputStream outObjectFile = new FileOutputStream("objOut", false);
            ObjectOutputStream outObjectStream = new ObjectOutputStream(outObjectFile);
            outObjectStream.writeObject(myGame);
            outObjectStream.flush();
            outObjectStream.close();
        } catch (FileNotFoundException fnfException) {
            System.out.println("No file");
        } catch (IOException ioException) {
            System.out.println();//"bad IO"
        }

        try {
            FileInputStream inObjectFile = new FileInputStream("objOut");
            ObjectInputStream inObjectStream = new ObjectInputStream(inObjectFile);
            Card myNewCard = (Card) inObjectStream.readObject();
            System.out.println(myNewCard);
        } catch (FileNotFoundException fnfException) {
            System.out.println("No File");
        } catch (IOException ioException) {
            System.out.println();//IO no good
        } catch (ClassNotFoundException cnfException) {
            System.out.println("This is not a Card.");
        }
    }
}