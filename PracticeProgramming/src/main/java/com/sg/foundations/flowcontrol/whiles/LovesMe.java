/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Bosak
 */
public class LovesMe {
    public static void main(String[] args) {
        int pedals = 34;
        // I used a while loop, if there were no pedals then there would be nothing to pluck!
        while(pedals > 0){
            if(pedals % 2 == 0){
                System.out.println("It loves me NOT!");
            }else{
                System.out.println("It LOVES me!");
            }
         pedals--;
        }
        System.out.println("It really does love me!");
    }
}
