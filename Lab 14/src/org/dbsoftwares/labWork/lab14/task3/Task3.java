/*
 * org.dbsoftwares.labWork.labWork14.task3.Task3
 * 
 */

package org.dbsoftwares.labWork.lab14.task3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tóth Péter György
 */
public class Task3 {
    
    public void GuessNumber(){
        System.out.println("Welcome! in task3");
        System.out.println("I will generate a number between 1 and 100.");
        System.out.println("You two need to guess it!");
        
        int generatedNumber;
        int firstPlayerScore = 0;
        int secondPlayerScore = 0; 
        
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i == 10 ; i++){
            generatedNumber = generator.nextInt(100);
            System.out.println("It has been generated, you need to guess it");
        
            System.out.println("First player's guess?");
            int firstPlayerGuess = input.nextInt();
            System.out.println("Second player's guess?");
            int secondPlayerGuess = input.nextInt();
            
            if (firstPlayerGuess == generatedNumber || (generatedNumber-firstPlayerGuess >= generatedNumber - secondPlayerGuess)) {
                System.out.println("The first player scores!");
                firstPlayerScore++;
            } else if (secondPlayerGuess == generatedNumber || (generatedNumber-firstPlayerGuess <= generatedNumber - secondPlayerGuess)) {
                System.out.println("The second player scores!");
                secondPlayerScore++;
            } else if (generatedNumber-firstPlayerGuess == generatedNumber - secondPlayerGuess && firstPlayerGuess < secondPlayerGuess){
                System.out.println("The first player scores!");
                firstPlayerScore++;
            } else {
                System.out.println("The second player scores!");
                secondPlayerScore++;
            }
            
            System.out.println("The generated number was: "+generatedNumber);
        }
        
        if (firstPlayerScore < secondPlayerScore){
            System.out.println("The first player wins!");
        } else if (firstPlayerScore < secondPlayerScore){
            System.out.println("The second player wins!");
        } else {
            System.out.println("It is even!");
        }
    }
}