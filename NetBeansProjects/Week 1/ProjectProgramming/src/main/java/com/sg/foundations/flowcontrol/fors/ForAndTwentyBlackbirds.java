package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - for
 * 
 */
public class ForAndTwentyBlackbirds {
    
    public static void main(String[] args) {
        
        //declare a variable and assign the value of '0' to it:
        int birdsInPie = 0;
        
        //create a 'for' loop to add 1 to 'i' as the loop runs:
        for (int i = 0; i < 20; i++) {
            
            //print:
            System.out.println("Blackbird #" + i + " goes into the pie!");
            
            //add 1 to the 'bridsInPie' variable:
            birdsInPie++;
        }

        //print:
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
    
}
