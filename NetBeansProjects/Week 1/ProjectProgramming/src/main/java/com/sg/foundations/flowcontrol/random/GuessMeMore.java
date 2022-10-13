package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - random
 * 
 */
public class GuessMeMore {
    
    public static void main(String[] args) {

        //declare and initialize the randomizer:
        Random randomizer = new Random();
        
        //declare and initialize the Scanner:
        Scanner myScanner = new Scanner(System.in);
         
        boolean start = true;
        
        //print a statement that uses the randomizer to generate a random integer:
        System.out.println("I have chosen a number between -100 and 100. Can you guess it?");
        System.out.println();
            
        //declare a varaible to store a random int between 1 and 100:
        int rand = randomizer.nextInt(100);
        
        while (start) {
            
            int guess;

            //declare String variables to hold the user's inputs:
            String stringGuess;

            //get input from the user:
            System.out.println("Please enter your guess: ");
            stringGuess = myScanner.nextLine();

            guess = (int) Float.parseFloat(stringGuess);

                if (rand < guess) {
                        System.out.println("Ha, nice try - too high! Try again!");
                }
                else if (rand > guess) {
                        System.out.println("Ha, nice try - too low! Try again!");
                }
                else if (rand == guess) {
                        System.out.println("Wow, nice guess! That was it!");
                }
        }

    }
}
    

