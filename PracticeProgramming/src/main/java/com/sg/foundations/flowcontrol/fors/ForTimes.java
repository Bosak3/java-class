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
public class ForTimes {
    public static void main(String[] args) {
        int userInput;
        String userInputString;
        
        System.out.println("Which times table shall I recite? ");
        Scanner sc = new Scanner(System.in);
        userInputString = sc.nextLine();
        userInput = Integer.parseInt(userInputString);
        
        for ( int i = 1; i < 16; i++){
            int sum = userInput * i;
            System.out.println(i + " * " + userInput + " is: " + sum);
        }
    }
}
