/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class GuessMeMore {
    public static void main(String[] args) {
        //  1) Write a program that has an Random integer stored in a variable
        
        Random randomNumber= new Random();
        int min = -100;
        int max = 100;
        int myNumber = randomNumber.nextInt(max + 1 - min) + min;
//  2) Ask the user to pick a number
        Scanner sc = new Scanner(System.in);
        System.out.println("I've chosen a number, bet you can't guess it");
        
        String userInput = sc.nextLine();
        
        int userNumberInput = Integer.parseInt(userInput);
           
        System.out.println("You've guessed:" + userNumberInput);
//  3) Print out user input as part of the response
//  4) If user choice is equal to the number print "Wow, nice guess! That was it!"
        if (userNumberInput == myNumber){
            System.out.println("Wow, nice guess! That was it");
        }else if(userNumberInput != myNumber){
            System.out.println("Incorrect! Here, try one more time");
            userInput = sc.nextLine();
            userNumberInput = Integer.parseInt(userInput);
        }
    
//  5) If user choice is less than the number print out: "Ha, nice try - too low! I chose #."
        if ( userNumberInput < myNumber){
            System.out.println("Ha, nice try - too low! I chose " + myNumber + ".");
        }
//  6) If user choice is greater than the number print out: "Too bad, way too high. I chose #.
        
        if ( userNumberInput > myNumber){
            System.out.println("Too bad, way too high. I chose " + myNumber);
        }
    }
}
