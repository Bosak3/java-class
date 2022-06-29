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
public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("How many sides does a single die have?");
        String stringUserInput = sc.nextLine();
        int userInput = Integer.parseInt(stringUserInput);
        
        
        int rollResult = diceRoller.nextInt(userInput) +1;
        
        System.out.println("TIME TO ROOOOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);
        
        if(rollResult == 1){
            System.out.println("You rolled a critical failure!");
        }else if(rollResult == userInput){
            System.out.println("You rolled a critical Nice job!");
        }
    }
}
