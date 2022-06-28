/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bosak3.practicewithloops;

import java.util.Random;

/**
 *
 * @author Bosak
 */
public class WhileLoopPractice {
    public static void main(String[] args) {
        Random rGen = new Random();
        int randomNum = rGen.nextInt(1) + 1;
        
        while (randomNum < 8){
            System.out.println(randomNum);
            randomNum = rGen.nextInt(10) + 1;
        }
    }    
}

