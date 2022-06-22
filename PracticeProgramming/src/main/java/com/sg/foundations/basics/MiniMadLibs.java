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
public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1, adjective1, noun2, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresentTense, verbPastTense;
        int number;
        String stringNumber;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please add the following: noun");
        noun1 = sc.nextLine();
        
        System.out.println("Please add the following: adjective");
        adjective1 = sc.nextLine();
        
        System.out.println("Please add the following: noun");
        noun2 = sc.nextLine();
        
        System.out.println("Please add the following: number");
        stringNumber = sc.nextLine();
        number = Integer.parseInt(stringNumber);
        
        System.out.println("Please add the following: adjective");
        adjective2 = sc.nextLine();
        
        System.out.println("Please add the following: plural noun");
        pluralNoun1 = sc.nextLine();
        
        System.out.println("Please add the following: plural noun");
        pluralNoun2 = sc.nextLine();
        
        System.out.println("Please add the following: plural noun");
        pluralNoun3 = sc.nextLine();
        
        System.out.println("Please add the following: verb present tense");
        verbPresentTense = sc.nextLine();
        
        System.out.println("Please add the following: same verb but past tense");
        verbPastTense = sc.nextLine();
        
        System.out.println(noun1 + ": the "+ adjective1 + ". These are the voyages of the starship " + noun2 + "."); 
        System.out.print("Its " + number + " year mission: to explore strange " + adjective2 + " " + pluralNoun1 + ", to seek out " + adjective2 +" "+ pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", to boldly ");
        System.out.println(verbPresentTense + " where no one has " + verbPastTense + " before.");
    }
}
