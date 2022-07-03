/*
 * Need to finish the Exercise, haven't made changes to original codeds
 */

package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Bosak
 */
public class ForByFor {
    public static void main(String[] args) {
        
        for ( int i = 0; i < 3; i++){
            System.out.print("|");
     
            for(int j = 0; j< 3; j++){
                for ( int k = 0; k < 3; k++){
                    System.out.print("*");
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
        
        
