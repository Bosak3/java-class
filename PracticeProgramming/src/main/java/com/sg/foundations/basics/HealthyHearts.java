/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.basics;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class HealthyHearts {
    public static void main(String[] args) {
        // create variables: userAge, maximumHeartRate, targetHeartRate
        int userAge;
        String stringUserAge;
                
        double maximumHeartRate;
        double targetHeartRate1;
        double targetHeartRate2;
        
        
        Scanner sc = new Scanner(System.in);
        // Ask user for their age
        System.out.println("What is your age?");
        stringUserAge = sc.nextLine();
        
        userAge = Integer.parseInt(stringUserAge);
            
       
        
        
        // Use user input to calculate and display maximumHeartRate
        maximumHeartRate = 220 - userAge;
        
        // The maximum heart rate shouold be 220 - userAge
        System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute.");
      
        // Use user input to calculate and display targetHeartRate
        targetHeartRate1 = maximumHeartRate * .5;
        targetHeartRate2 = maximumHeartRate * .85;
        // The target heart rate zone is 50 - 85% of the maximum heart rate
        System.out.println("Your target Heart Rate Zone is " + targetHeartRate1 + " - " + targetHeartRate2 + " beats per minute.");
    }
}
