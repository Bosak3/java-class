/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Bosak
 */
public class WaitAWhile {
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedtime = 10;
        
        while(timeNow < bedtime){
            System.out.println("It's only " + timeNow +" o'clock!");
            System.out.println("I think I'll stay up just a little longer....");
            timeNow++; // Time passes
        }
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }

}
