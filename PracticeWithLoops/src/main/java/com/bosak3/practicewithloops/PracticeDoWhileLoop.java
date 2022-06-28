/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bosak3.practicewithloops;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class PracticeDoWhileLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int userNumber;
        String userNumberString;
        
        do {
            System.out.println("Please enter a number between 1 & 20");
            userNumberString = sc.nextLine();
            userNumber = Integer.parseInt(userNumberString);
        
        } while (userNumber < 1 || userNumber > 20);
        
        System.out.println("Thank you!!! Your number was " + userNumber);
     }
}
