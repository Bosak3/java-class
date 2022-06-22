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
public class DoItBetter {
    public static void main(String[] args) {
        // create variables for userMilesRan, userHotDogsEaten, userLanguagesKnown
        int userMilesRan;
        int userHotDogsEaten;
        int userLanguagesKnown;
        
        // create String variables for user input to parse into integers.
        String stringUserMilesRan;
        String stringUserHotDogsEaten;
        String stringUserLanguagesKnown;
        
        // create variables for aiMilesRan, aiHotDogsEaten, aiLanguagesKnown
        
        
        
        
        // Declare/Initiate Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // ask user how many miles they can run, hotdogs they can eat, languagaes they know
        // after each question print out statement that multiplies user input by 2 and adds 1
        // bragging that the ai can do more
        System.out.println("How many miles can you run?");
        stringUserMilesRan = myScanner.nextLine();
        
        // Parse string into integer and assign to int variable for userMilesRan
        userMilesRan = Integer.parseInt(stringUserMilesRan);
        int aiMilesRan = userMilesRan * 2 + 1;
        
        // multiply user input by 2 and add 1, assign to corresponding ai variable
        System.out.println(userMilesRan + "! That's nothing I can run " + aiMilesRan + "!" );
        
        System.out.println("How many hotdogs can you eat?");
        stringUserHotDogsEaten = myScanner.nextLine();
        
        userHotDogsEaten = Integer.parseInt(stringUserHotDogsEaten);
        int aiHotDogsEaten = userHotDogsEaten * 2 + 1;
        
        System.out.println(userHotDogsEaten + "! You need to practice, I can eat " + aiHotDogsEaten + "!");
        
        
        System.out.println("How many languages do you know?");
        stringUserLanguagesKnown = myScanner.nextLine();
        
        userLanguagesKnown = Integer.parseInt(stringUserLanguagesKnown);
        int aiLanguagesKnown = userLanguagesKnown * 2 + 1;
        
        System.out.println(userLanguagesKnown + "! That's not very many, I can speak " + aiLanguagesKnown + "!");
               
        
        
    }
            
}
