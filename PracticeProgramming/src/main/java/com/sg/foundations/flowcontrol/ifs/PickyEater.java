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
public class PickyEater {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many times has it been fried?");
        int timesFried = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Does it have Spinach in it? (y/n)");
        String hasSpinach = userInput.nextLine();
        
        System.out.println("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.nextLine();
        
        System.out.println("How many pats of butter are on top? (#)");
        int butterPats = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Is it covered in chocolate? (y/n)");
        String chocolateCovered = userInput.nextLine();
        
        System.out.println("Does it have a funny name? (y/n)");
        String funnyName = userInput.nextLine();
        
        System.out.println("Is it broccoli? (y/n)");
        String isBroccoli = userInput.nextLine();
        
        if(hasSpinach.equals("y") || funnyName.equals("y")){
            System.out.println("There's no way he'll eat that!");
        }
        
        if(timesFried > 2 && timesFried < 4 && chocolateCovered.equals("y")){
            System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        }
        
        if(timesFried == 2 && cheeseCovered.equals("y")){
            System.out.println("Mmm. Yeah, he'll eat frie cheesy doodles.");
        }
        
        if( isBroccoli.equals("y") && butterPats > 6 && cheeseCovered.equals("y")){
            System.out.println("As long as the green is hidden by cheddar, it'll happen!");
        }else if(isBroccoli.equals("y")){
            System.out.println("Oh, green stuff like that might as well go in the bin.");
        }
        
    }
}
