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
public class FieldDay {
    public static void main(String[] args) {
    // declare variables
        Scanner sc = new Scanner(System.in);
        
    // ask user for name
        
        System.out.println("What's your last name?");
        String userName = sc.nextLine();
        String s1 = "Baggins";
        
        int A = userName.compareToIgnoreCase(s1);
  
        
    // based on user input determine which team they will be placed on
    // if user input falls before Baggins, they are team "Red Dragaons"
    if ( A < 0){
        System.out.println("Your on team, Red Dragons!");
    } 
  
    // if it falls after Baggins, but before Dresden they are on team "Dark Wizards
    // if it falls after Dresden, but before Howl, they are on the team "Moving Castles"
    // if it falls after Howl, but before Potter, they are on the team "Golden Snitches"
    // if it falls after Potter, but before Vimes, they are on the team "Night Guards"
    // if it falls after Vimes, they are on the team "Black Holes"  
   

        
    
        
  }
}
    
        
        
        
