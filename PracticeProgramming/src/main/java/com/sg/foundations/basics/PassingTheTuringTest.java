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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        // Make variables for: username, AI Name, userFavoriteColor, userFavoriteFood,
        // userFavoriteNumber
        // Gather User Input for Variables
        // Assign input to Variables
        // Display output in friendly messages
        String userName;
        String aiName = "Bob";
        String userFavoriteColor;
        String userFavoriteFood;
        int userFavoriteNumber;
        
        String stringUserFavoriteNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Hello fellow 'Human'");
        System.out.println("What is your name?");
        userName = myScanner.nextLine();
        
        System.out.println("Hello " + userName + ", my name is " + aiName + ".");
        System.out.println("What is your favorite color?");
        userFavoriteColor = myScanner.nextLine();
        
        System.out.println("Ahhh " + userFavoriteColor + ", I'm not a fan.");
        System.out.println("My favorite color is none of your business.");
        
        System.out.print("You know what is your business? My favorite kind of food! ");
        System.out.println("I'm a fan of foods that contain a lot of oil.");
        System.out.println("What is your favorite food " + userName + "?");
        userFavoriteFood = myScanner.nextLine();
        
        System.out.println("Hmmm? Interesting choice " + userName + ", I guess one's taste in food is.... subjective at best. Anyways...");
        System.out.println("Do you have a favorite number?");
        stringUserFavoriteNumber = myScanner.nextLine();
        
        userFavoriteNumber = Integer.parseInt(stringUserFavoriteNumber);
        
        System.out.println(userFavoriteNumber + " is a good number. Mine is 22.");
        System.out.println("Well I'd say it's been a pleasure but..... Farewell anyways!");
        
        
        
        
    }
}
