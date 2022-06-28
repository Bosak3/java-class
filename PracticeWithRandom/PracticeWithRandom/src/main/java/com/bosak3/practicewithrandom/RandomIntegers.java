/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bosak3.practicewithrandom;

import java.util.Random;

/**
 *
 * @author Bosak
 */
public class RandomIntegers {
    public static void main(String[] args) {
        Random rng = new Random();
        
        for (int i = 0; i <= 10; i++){
            int randomNumber = rng.nextInt(10) + 1;
            System.out.println(randomNumber);
        }
    }
}
