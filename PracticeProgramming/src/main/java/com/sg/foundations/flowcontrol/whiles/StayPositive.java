/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class StayPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        Integer count = sc.nextInt();
        final int PER_LINE = 10;
        
        if(count < 0){
            //checks input is positive integer
            System.out.println("Please enter a positive integer...");
        }else {
            // take user input and count down
            while(count > 0){
                System.out.print(count + " ");
                count--;
                // minimize number of items printed to 10
                if (count % PER_LINE == 0){
                    System.out.println();
                }


            }
        }
        
        
    }
}
