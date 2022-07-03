/*
Can't seem to get it to alternate between lovesMeNot & lovesMe properly
Also wasn't able to figure out how to print the final message dependent on 
what the last pedal lands on.
 */

package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Bosak
 */
public class MaybeItLovesMe {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int max = 89;
        int min = 13;
        String lovesMeNot = "It loves me NOT!";
        String lovesMe = "It loves ME!";
        
        int pedals = randomNumber.nextInt(max + 1 - min) + min;
        System.out.println(pedals);
        // I used a while loop, if there were no pedals then there would be nothing to pluck!
        while(pedals > 0){
            if(pedals % 2 == 0){
                System.out.println(lovesMeNot);
            }else{
                System.out.println(lovesMe);
            }
         pedals--;
        }
        
        
    }
}
        
