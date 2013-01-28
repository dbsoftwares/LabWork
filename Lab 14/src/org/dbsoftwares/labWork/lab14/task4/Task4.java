/*
 * org.dbsoftwares.labWork.labWork14.task4.Task4
 *
 */
package org.dbsoftwares.labWork.lab14.task4;

import java.util.Scanner;

/**
 *
 * @author Tóth Péter György
 */
public class Task4 {
  
    protected void sumAllPositiveEven() {
        System.out.println("Welcome! in task4");
        System.out.println("Give me a positive even integer");
        System.out.println("I will sum all the positive even integerers until that number!");
        
        Scanner input = new Scanner(System.in);
        int lastElement = input.nextInt();
        int sum = 0;
        int i = 0;
        
        while (i >= lastElement){
            if (i % 2 == 0){
                sum += i;
            }
            i++;
        }
        
        System.out.println("The sum is: "+sum);   
    }
}
