/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Bosak
 */
public class SpringForwardFallBack {
    public static void main(String[] args) {
        System.out.println("It's Spring...!");
        
        //start range for output is 0, stop is 9
        for ( int i = 1; i < 10; i++){
            System.out.println(i + ", ");
        }
        
        //start is 10, stop is 1
        System.out.println("Oh no, it's fall...");
        for (int i = 9; i > 0; i--){
            System.out.println(i + ", ");
        }
    }
}
