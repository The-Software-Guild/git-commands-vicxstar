package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - whiles
 * 
 */
public class WaitAWhile {
    
     public static void main(String[] args) {

         //declare the variables:
        int timeNow = 5;
        int bedTime = 10;

        //create a loop that will continue until the conditions have been met:
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            
            //increase 'timeNow' variable by 1:
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
     
}
