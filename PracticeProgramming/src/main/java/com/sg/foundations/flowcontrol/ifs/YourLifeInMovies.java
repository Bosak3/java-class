/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        // Write an program that displays a different message based on the year
        // someone was born to  make them feel old
        // declare variables
        System.out.println("Hello, want to play a game :)??? What's your name?");
        
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        
        System.out.println("Welcome to my game, " + userName + ", what year were you born?");
        String stringNumber = sc.nextLine();
        
        int userNumber = Integer.parseInt(stringNumber);
        
        System.out.println("Let me make you feel old real quick...");
        // write if statemen'ts to display messages based on the year they were born
        if(userNumber < 2005){
            System.out.println("Lord of the Rings came out two decades ago!");
        }
        if(userNumber < 1995){
            System.out.println("You survived Jurassic period! And it shows!");
        }
        if(userNumber < 1980){
            System.out.println("Oh one more thing, did you enjoy the premiere of Citizen Kane?");
        }
    }
}
