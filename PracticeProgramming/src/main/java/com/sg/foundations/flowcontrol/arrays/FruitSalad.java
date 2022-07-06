/*
 * Code not working properly, can fruitSalad array contains non fruit elements
 * Count for how many fruit and sout for type of fruit not implemented. 
 */

package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author Bosak
 */
public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple",
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", 
            "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        String[] fruitSalad = new String[24];
        //add all the berry's to an array 6
        //no more than three kinds apples 3
        //no more than two kinds of oranges2
        //no tomatoes
        
        //no more than twelve kinds of fruits
        
        for(int i = 0; i < fruit.length; i++){
            
                if(fruit[i].toUpperCase().contains("GALA APPLE")){
                    fruitSalad[i] = fruit[i];
                    
                }else if(fruit[i].toUpperCase().contains("GRANNY SMITH APPLE")){
                    fruitSalad[i] = fruit[i];
                }else if(fruit[i].toUpperCase().contains("BRAEBURN APPLE")){
                    fruitSalad[i] = fruit[i];
                }else if(fruit[i].toUpperCase().contains("BERRY")){
                    fruitSalad[i] = fruit[i];
                }else if(fruit[i].toUpperCase().contains("BLOOD ORANGE")){
                    fruitSalad[i] = fruit[i];
                }else if(fruit[i].toUpperCase().contains("FLORIDA ORANGE")){
                    fruitSalad[i] = fruit[i];
                }else{
                    fruitSalad[i] = "0";
                }
                
                System.out.println(fruitSalad[i]);
                
        }
        
    }
}

                    
            
