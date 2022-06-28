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
public class KnockKnock {
    public static void main(String[] args) {
        System.out.println("Knock Knock! Gues Who!! ");
        
        Scanner inputReader = new Scanner(System.in);
        String nameGuess = inputReader.nextLine();
        //changing .equals to ==. Stops the program from comparing a string to a string.
        //and doesn't properly compare the parameters/args
        
        //added equalsIgnorCase to account for different capitalizations.
        if(nameGuess.equalsIgnoreCase("Marty McFly")){
            System.out.println("Hey! That's rigth! I'm back!");
            System.out.println("... from the future.");
        }else{
            System.out.println("Dude, do I -look- like" + nameGuess);
        }
    }
}
