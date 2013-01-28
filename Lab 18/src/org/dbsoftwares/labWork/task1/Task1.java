/*
 * org.dbsoftwares.labWork.lab18.task1
 * 
 */
package org.dbsoftwares.labWork.task1;

import java.util.Random;

/**
 *
 * @author Tóth Péter György
 */
public class Task1 {
    
    private String[] cardRanks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private String[] cardSuits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    private String[] deck = new String[51];
    private int i;
    private int j;
    
    /**
     *
     * @param numberOfPlayers: the number of players 
     * you want to distribute cards to
     */
    public void distrubuteCardsToPlayers(int numberOfPlayers) {
        createDeck();
        shuffleDeck();
        
        for (i = 1; i <= numberOfPlayers; i++) {
            System.out.println("Player "+i);
            for (j = 0; j <= 4; j++) {
                System.out.println(deck[i+numberOfPlayers*j-1]);
                
                /* For testing the distribution:
                 * System.out.println(i+numberOfPlayers*j-1);
                 */ 
            }
            System.out.println("\n");
        }
    }
    
    private void createDeck(){
        
        // Spades
        for (i = 0; i <= 12; i++) {
            deck[i] = cardRanks[i]+" of "+cardSuits[0];
        }
        
        // Hearts
        for (i = 0; i <= 12; i++) {
            deck[i+12] = cardRanks[i]+" of "+cardSuits[1];
        }
        
        // Clubs
        for (i = 0; i <= 12; i++) {
            deck[i+25] = cardRanks[i]+" of "+cardSuits[2];
        }
        
        // Diamonds
        for (i = 0; i <= 12; i++) {
            deck[i+38] = cardRanks[i]+" of "+cardSuits[3];
        }
        
        /* Test the deck
         * for (i = 0; i < deck.length; i++) {
         *      System.out.println(deck[i]);
         * }
         */
        
    }
    
    private void shuffleDeck(){
        Random generator = new Random();
        int generatedNumber1 = 0;
        int generatedNumber2 = 0;
        String pulledCard = null;
        
        for (i = 0; i <= 26; i++) {
            generatedNumber1 = generator.nextInt(51);
            generatedNumber2 = generator.nextInt(51);
            pulledCard = deck[generatedNumber1];
            deck[generatedNumber1] = deck[generatedNumber2];
            deck[generatedNumber2] = pulledCard;
        }
    }       
}
