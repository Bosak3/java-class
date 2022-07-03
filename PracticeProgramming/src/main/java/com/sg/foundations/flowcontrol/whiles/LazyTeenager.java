/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Bosak
 */
public class LazyTeenager {
    public static void main(String[] args) {
        // write a program that simulates parents telling a teenager to clean their
        // room
        // declare variables
        Random rndm = new Random();
        
        int i = 1;
        
        
        
        boolean isClean = false;
        
        do{
            System.out.println("Clean your room!");
            
        }while(isClean);
        
        
        // Use a do-while loop that executes until the room is clean
        
        
        //Every time the loop executes, the parent should tell the teenager to clean
        //Each time teenager is told to clean, it increasses the chance the teenager
        //will clean by 10%.
        //Use Random to calculate this "chance" check.
        //By the 7th time, they get gronded and hace their xbox taken. Use a break
        // not a compound condition to stop the loop in this case.
        
    }
}
