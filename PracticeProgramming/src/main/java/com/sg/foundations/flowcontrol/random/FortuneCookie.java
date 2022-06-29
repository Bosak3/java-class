/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Bosak
 */
public class FortuneCookie {
    public static void main(String[] args) {
        //write a program that prints a random quote
        //intialize Random variable
        Random randomizer = new Random();
        
        int x = randomizer.nextInt(11);
        //Use switch case to decide which quote is printed
        switch(x){
            case 1:
                System.out.println("All tha glitters is not gold, all who wander are not lost.");
                break;
            case 2:
                System.out.println("You can't handle the truth!");
                break;
            case 3:
                System.out.println("Your Mother was a Hamster and your father smelt of Ederberries! ");
                break;
            case 4:
                System.out.println("Beuller? Beulller? Bueller?");
                break;
            case 5:
                System.out.println("Great Scott!");
                break;
            case 6:
                System.out.println("How you doin?");
                break;
            case 7:
                System.out.println("Don't be upset about the progres you haven't made, with the work you haven't put in.");
                break;
            case 8:
                System.out.println("So it goes.");
                break;
            case 9:
                System.out.println("As you wish.");
                break;
            case 10:
                System.out.println("It is known");
        }
        // print out quote to console
        System.out.println("Enjoy your free words!");
    }
}
