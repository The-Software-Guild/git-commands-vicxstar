package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - whiles
 * 
 */
public class LazyTeenager {
    
    public static void main(String[] args) {
        
        //declare a variable and assign a value of '0' to it:
        int clean = 0;
        
        //declare and initalise random:
        Random random = new Random();
        
        //generate a random double number:
        double randNum = random.nextDouble();
        
        //declare a double variable, and set it to '0':
        double chances = 0.0;
        
        //create a 'do - while' loop:
        do {
            
            //increase the 'clean' variable by 1 as the program loops:
            clean++;
            
            //print:
            System.out.println("Clean your room! (x" + clean + ")");
            
            //add the value of 'chances' to '0.1' and assign the result to the variable 'chances':
            chances += 0.1;
            
            //create an 'if' statement to print a statement once 'chances' reaches the value of '7': 
            if (clean == 7) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            
            //create an 'if' statement to print a statement if the random double is less than the value in 'chances':
            if (randNum <= chances) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }
        }
        
        //the 'while' statement for if 'randNum' is bigger than 'chances':
        while (randNum > chances);
    }
    
}
