/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author Bosak
 */
public class NewClass {
    public static void main(String[] args) {
        String color = randomColor();
        String colorAgain = randomColor();
        String animal = randomAnimal();
        int weight = randomNumber(5, 200);
        int distance = randomNumber(10, 20);
        int number = randomNumber(10000, 20000);
        int time = randomNumber(2,6);
        
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
        
    
    
    }
    
    public static String randomColor(){
        Random rng = new Random();

        String[] colors = new String[] { "Blue", "Green", "Orange", "Brown", "Purple" };
        int randomIndex = rng.nextInt( colors.length );
        String randomColor = colors[randomIndex];
        return randomColor;
   
    }
    
        public static String randomAnimal(){
        Random rng = new Random();

        String[] animals = new String[] { "Sloth", "Blue Whale", "Balinese Kitten", "Lion", "Koala" };
        int randomIndex = rng.nextInt( animals.length );
        String randomColor = animals[randomIndex];
        return randomColor;
   
    }
        public static int randomNumber(int x, int y){
            Random rng = new Random();
            int min = x;
            int max = y;
            int randomInt = rng.nextInt((max - min) + min);
            return randomInt;
        }
}
