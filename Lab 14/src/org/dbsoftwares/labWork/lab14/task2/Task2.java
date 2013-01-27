/*
 * org.dbsoftwares.labWork.labWork14.task2.Task2
 * 
 */
package org.dbsoftwares.labWork.lab14.task2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tóth Péter György
 */
public class Task2 {
    
    /**
     * The machine generate a number between 1 and 100
     * The two player needs to guess it!
     */
    public void GuessNumber() {
        System.out.println("Welcome! in task2");
        System.out.println("I will generate a number between 1 and 100.");
        System.out.println("You two need to guess it!");
        
        // Generating the number
        int generatedNumber;
        Random generator = new Random();
        generatedNumber = generator.nextInt(100);
        System.out.println("It has been generated, you need to guess it");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("First player's guess?");
        int firstPlayerGuess = input.nextInt();
        System.out.println("Second player's guess?");
        int secondPlayerGuess = input.nextInt();
        
        if (firstPlayerGuess == generatedNumber || (generatedNumber-firstPlayerGuess >= generatedNumber - secondPlayerGuess)) {
            System.out.println("The first player wins!");
        } else if (secondPlayerGuess == generatedNumber || (generatedNumber-firstPlayerGuess <= generatedNumber - secondPlayerGuess)) {
            System.out.println("The second player wins!");
        } else if (generatedNumber-firstPlayerGuess == generatedNumber - secondPlayerGuess && firstPlayerGuess < secondPlayerGuess){
            System.out.println("The first player wins!");
        } else {
            System.out.println("The second player wins!");
        }
        
        System.out.println("The generated number was: "+generatedNumber);
    }
}
