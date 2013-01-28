/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dbsoftwares.labWork;

import java.util.Scanner;
import org.dbsoftwares.labWork.task1.Task1;

/**
 *
 * @author Tóth Péter György
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("This program will distribute cards in the game of Poker...");
        System.out.println("Set the number of players:");
        
        Scanner input = new Scanner(System.in);
        int numberOfPlayers = input.nextInt();
        
        System.out.println("The ditributed cards are:");
        
        Task1 TaskNumber1 = new Task1();
        TaskNumber1.distrubuteCardsToPlayers(numberOfPlayers);
    }
}
