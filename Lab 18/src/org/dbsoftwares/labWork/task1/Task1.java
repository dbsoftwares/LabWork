/*
 * org.dbsoftwares.labWork.lab18.task1
 * 
 */
package org.dbsoftwares.labWork.task1;

/**
 *
 * @author Tóth Péter György
 */
public class Task1 {
    
    
    
    public void createDeck(){
        String[] cardRanks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] cardSuits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] deck = new String[51];
        int i = 0;
        
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
        
        for (i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
    
    public void shuffleDeck(){
    
    }
    
    public void getGamers(){
        
    }
            
}
