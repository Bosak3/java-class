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
public class DontForgetToStoreIt {
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything;
        double pi;
        String cheese;
        String color;
        
        Scanner inputReader = new Scanner(System.in);
        
        String stringMeaningOfLifeAndEverything;
        String stringPi;
        
        System.out.println("Give me pi to at least 5 decimals: ");
        stringPi = (inputReader.nextLine());
        
        // We've use Double.parseDouble but meaningOfLIfeAndEverything is an INT
        // so we'll have to use Integer.parseInt
        
        System.out.println("What is the meaing of life, the universe & everything? ");
        stringMeaningOfLifeAndEverything = (inputReader.nextLine());
        
        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.nextLine();
        
        pi = Double.parseDouble(stringPi);
        meaningOfLifeAndEverything = Integer.parseInt(stringMeaningOfLifeAndEverything);
        
         System.out.println("Ooh," + color + " " + cheese + " sounds delicious!");
         System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
    }
}
