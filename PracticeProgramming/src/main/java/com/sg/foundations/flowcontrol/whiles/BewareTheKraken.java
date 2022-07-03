/*
 * Random Fish Generator Not working as expected, only chooses one fish for entire 
   duration of loop. Need to have a different fish each run through.
 */

package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class BewareTheKraken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooo.....! *SPLASH*");
        
        //generate a random fish
        Random rng = new Random();
        String[] fish = new String[] {"Clown Fish", "Angler Fish", "What is that thing!"};
        int randomIndex = rng.nextInt(fish.length);
        String randomFish = fish[randomIndex];
        
        int depthDivedInFt = 0;
        // Turns out the ocean is only so deep, 36200 at the deepest survey
        // so if we reach the bottom .. we shoud probably stop.
        
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum" + depthDivedInFt + " feet");
            
            
            if (depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys .... ");
                System.out.println("Would you like to stop? (y/n)");
                String userInput = sc.nextLine();
                if(userInput.equals("y")){
                    System.out.println("TIME TO GO!");
                    break;
                }else{
                   while(depthDivedInFt < 36200){
                    System.out.println("So far, we've swum" + depthDivedInFt + " feet");
                    System.out.println(randomFish);
                    depthDivedInFt += 1000;
                    
                    
                   }
                }
                
            }
            
            depthDivedInFt += 1000;
            System.out.println(randomFish);
        }
            
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
                
                
                
            
