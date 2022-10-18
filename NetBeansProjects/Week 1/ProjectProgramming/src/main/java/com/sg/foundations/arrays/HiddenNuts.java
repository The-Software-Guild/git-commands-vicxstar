package com.sg.foundations.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Arrays
 */
public class HiddenNuts {
    
    public static void main(String[] args) {

        //declare a varaible and place values into them:
        String[] hidingSpots = new String[100];
        
        //declare and initialize random:
        Random squirrel = new Random();
        
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        //use the 'for' statement to go through the arrays in the 'hidingSpots' variable: 
        for (int i = 0; i < hidingSpots.length; i++) {
            
            //create a loop using the 'if' statement and append the value of 'i' to iterate through 'hidingSpots' to check if it's != to 'null':
            if (hidingSpots[i] != null) {
                
                //if it is != to 'null', print:
                System.out.println("Found it! It's in spot #" + i);
            }
    }
    }   
}
