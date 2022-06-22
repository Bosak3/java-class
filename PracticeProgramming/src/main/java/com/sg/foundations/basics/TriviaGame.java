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
public class TriviaGame {
    public static void main(String[] args) {
        // create variables for trivia question answers
        // mix up answers given by user when results are printed
        
        // declare variables
        String answer1;
        int answer2;
        String answer3;
        
        // declare String variable to parse into Integer
        String stringAnswer2;
        
        // Declare/Initiate new Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // print out question to user
        // read input from user and assign to a variable
        System.out.println("Who is the creator in J.R.R Tolkiens 'The Simarillion?");
        answer1 = myScanner.nextLine();
        
        System.out.println("How many rings of power were Created by Sauron?");
        stringAnswer2 = myScanner.nextLine();
        // Parse String into integer to assign to answer2 variable
        answer2= Integer.parseInt(stringAnswer2);
        
        System.out.println("Who created the Rings of Power?");
        answer3 = myScanner.nextLine();
        
        System.out.println("Very interesting, the creator is " + answer3 + ".");
        System.out.println("He made " + answer1 + ", that is a lot of rings!");
        System.out.println(answer2 + " created all of the rings of power except for 1, which was the great ring created in secret by sauron.");
    }
}
