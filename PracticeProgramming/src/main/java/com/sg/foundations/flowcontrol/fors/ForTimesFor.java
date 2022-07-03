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
public class ForTimesFor {
    public static void main(String[] args) {
        int userInput;
        String userInputString;
        String userAnswerString;
        int userAnswer;
        int count = 0;
        
        System.out.println("Which times table shall I recite? ");
        Scanner sc = new Scanner(System.in);
        userInputString = sc.nextLine();
        userInput = Integer.parseInt(userInputString);
        
        for ( int i = 1; i < 16; i++){
            System.out.println(i + " * " + userInput + " is: ");
            userAnswerString = sc.nextLine();
            userAnswer = Integer.parseInt(userAnswerString);
            
            int sum = userInput * i;
            
            if(userAnswer == sum){
                System.out.println("Correct!");
                count++;
            }else{
                System.out.println("Sorry no, the answer is: " + sum);
            }
            System.out.println("You got " + count + " correct");
        }
        if(count > 14){
            System.out.println("Congradulations, you're brilliant!");
        }else if(count <= 7 ){
            System.out.println("Ouch, you should hit the books.");
        }
    }
}
