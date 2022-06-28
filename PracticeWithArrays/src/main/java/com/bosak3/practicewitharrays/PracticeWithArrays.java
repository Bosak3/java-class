/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bosak3.practicewitharrays;

/**
 *
 * @author Bosak
 */
public class PracticeWithArrays {
    public static void main(String[] args) {
    /*
        // SINGLE DIMESNIONAL ARRAY
        // create a new array with 4 elements )defalut 0 for int)
        int [] numbers = new int [4];
        
        // same array specifying element values
        int[] numbers2 = {0, 0, 0, 0};
        
        // same array, using a slightly older ( and ore verbose) syntax
        // NOTE: this is outdated, but you may see code like this in the wild
        int[] numbers3 = new int[] { 0, 0, 0, 0};
        
        //RECTANGULAR ARRAY
        int rows = 2;
        int columns  = 3;
        int[][] table = new int[rows] [columns];
        // could aslo be written as new int [2][3]
        
        //Initialized Rectangular Array
        int [][] autoIntTable = {{5, 3, 1},{2, 4, 6}};
        
        //JAGGED ARRAY
        // array with 3 elements that are each an array
        // another jagged array example
        
        int[][] jagged = new int[3][];
        
        jagged[0] = new int[] { 1, 2 };
        jagged[1] = new int[] { 3, 4, 5, 6 };
        jagged[2] = new int[] {7, 8, 9};
    
        int[] numbers = {3, 5, 2, 1};
        int sum = 0; //keep running total
        
            for (int i = 0; i < numbers.length; i++){
                sum += numbers[i];
                System.out.println("i = " + i + " current sum = " + sum);
            }
            System.out.println("Final sum: " + sum);
    
        //
        int[] numbers = { 3, 5, 2, 0};
        //start at last index, go to first (0)
        for ( int i = numbers.length - 1; i >= 0; i --){
             if(i % 2 == 1 ){
                System.out.println("index "+ i + " - " + numbers[i]);
            }
        }
        
        //
    
        int[] numbers = {1,2,3,4,5,6};
            for(int i = 0; i < numbers.length - 2; i += 3){
                System.out.println("Pair: (" + numbers [i] + ", " + numbers [i + 1] + ")");
            }
    */
        //
        
       
    }
       
    
    public int[] GrowArray(int[] original, int howManyMoreElements){
        int[] newArray = new int[original.length + howManyMoreElements];
        
        for (int i = 0; i <original.length; i++){
            // copy the element at the current index
            // from original to newArray
            
            newArray[i] = original[i];
        }
        return newArray;
    }
    
    
}
