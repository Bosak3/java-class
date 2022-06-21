/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bosak3.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class WindowMaster {
    public static void main(String [] args){
        // declare variables for height and width
        float height;
        float width;
        int windows;
        
        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;
        String stringNumberOfWindows;
        
        String glassCost;
        String trimCost;
        
        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float glassPrice;
        float trimPrice;
        
        
        // declare and initialize the Scanner
        
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        
        
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        System.out.println("Please enter number of Windows:");
        stringNumberOfWindows = myScanner.nextLine();
        
        System.out.println("Please enter material cost for Window:");
        glassCost = myScanner.nextLine();
        
        System.out.println("Please enter material cost for Window Trim:");
        trimCost = myScanner.nextLine();
        
        
        // convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        windows = Integer.parseInt(stringNumberOfWindows);
        glassPrice = Float.parseFloat(glassCost);
        trimPrice = Float.parseFloat(trimCost);
        
        // calculate the area of the window
        areaOfWindow = height * width;
        
        // calculate perimiter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = (((glassPrice * areaOfWindow) + (trimPrice * perimeterOfWindow)) * windows);
        
        // display the results to the user
        System.out.println("Window height =" + stringHeight);
        System.out.println("Window width =" + stringWidth);
        System.out.println("Window count =" + stringNumberOfWindows);
        System.out.println("Window area =" + areaOfWindow);
        System.out.println("Window perimeter =" + perimeterOfWindow);
        System.out.println("Total Cost =" + cost);
        
    }
    
}
