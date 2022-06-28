/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class BirthStones {
    public static void main(String[] args) {
        //Declare variables
        System.out.println("Which months birthstone are you looking for?");
        //Ask user for a number
        Scanner sc = new Scanner(System.in);
        String stringUserMonth = sc.nextLine();
        int userMonth = Integer.parseInt(stringUserMonth);
        //Match the number against the month number
        //Print out the name of the month and its corresponding birthstone.
        if( userMonth == 1){
            System.out.println("January's birthstone is Garnet.");
        }else if(userMonth == 2){
            System.out.println("February's birthstone is Amethyst.");
        }else if(userMonth == 3){
            System.out.println("March's birthstone is Aquamarine.");
        }else if(userMonth == 4){
            System.out.println("April's birthstone is Diamond.");
        }else if(userMonth == 5){
            System.out.println("May's birthstone is Emerald.");
        }else if(userMonth == 6){
            System.out.println("June's birthstone is Pearl.");
        }else if(userMonth == 7){
            System.out.println("July's birthstone is Ruby.");
        }else if(userMonth == 8){
            System.out.println("August's birthstone is Peridot.");
        }else if(userMonth == 9){
            System.out.println("September's birthstone is Saphire.");
        }else if(userMonth == 10){
            System.out.println("October's birthstone is Opal.");
        }else if(userMonth ==11){
            System.out.println("November's birthstone is Topaz.");
        }else if(userMonth == 12){
            System.out.println("December's birthstone is Turquoise.");
        }else{
            System.out.println("You may be confused, " + userMonth + " doesn't match a month." );
        }
        //If the user enters an invalid month display an appropriate error message
    }
}
