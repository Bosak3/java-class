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
public class TheCount {
    public static void main(String[] args) {
        //declare variables: userStart, userEnd, userIncrement
        Scanner sc = new Scanner(System.in);
        int userStart;
        String userStartString;
        int userEnd;
        String userEndString;
        int userIncrement;
        String userIncrementString;
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        System.out.println("Start at :");
        userStartString = sc.nextLine();
        userStart = Integer.parseInt(userStartString);
        
        System.out.println("Stop at : ");
        userEndString = sc.nextLine();
        userEnd = Integer.parseInt(userEndString);
        
        System.out.println("Count by: ");
        userIncrementString = sc.nextLine();
        userIncrement = Integer.parseInt(userIncrementString);
        
        for(int i = userStart; i < userEnd; i += userIncrement ){
            System.out.println(i);
        }
        
        //write for-loop to print values from start through end values
        //incrementing by specified amount
    }
}
