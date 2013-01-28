/*
 * org.dbsoftwares.labWork.lab18.task2
 * 
 */
package org.dbsoftwares.labWork.task2;

import java.util.Scanner;

/**
 *
 * @author Tóth Péter György
 */
public class Task2 {
    
    public void reverseArray(){
        System.out.println("Welcome!");
        System.out.println("This program will reverse the given array of double numbers.");
        System.out.println("Give me the size of your array:");
        
        Scanner input = new Scanner(System.in);
        int sizeOfArray = input.nextInt();
        double[] doubleNumbersArray = new double[sizeOfArray];
        
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Please enter the "+(i+1)+". element:");
            doubleNumbersArray[i] = input.nextDouble();
        }
        
        //output of original order
        System.out.println("Thanks, I got them all!");
        System.out.println("They are:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(doubleNumbersArray[i]+" ");
        }
        
        System.out.println("\n"+"Now, i will reverse the order of the array!");
        
        double pulledNumber;
        for(int i = 0; i < doubleNumbersArray.length / 2; i++) {
            pulledNumber = doubleNumbersArray[i];
            doubleNumbersArray[i] = doubleNumbersArray[sizeOfArray-i-1];
            doubleNumbersArray[sizeOfArray-i-1] = pulledNumber;
        }
        
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(doubleNumbersArray[i]+" ");            
        }
        System.out.println("\n");
    }
}
