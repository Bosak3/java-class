/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        String userInputString = sc.nextLine();
        int userInput = Integer.parseInt(userInputString);
        
        for (int i = 0; i < userInput; i++){
          
         if(i % 3 == 0 && i % 5 == 0){
             System.out.println("fizzbuzz");
            } else if(i % 3 == 0){
              System.out.println("fizz");
            }else if( i % 5 == 0){
              System.out.println("buzz");
            }else{
              System.out.println(i);
          }
        }
        System.out.println("TRADITON!!!!");
    }
}