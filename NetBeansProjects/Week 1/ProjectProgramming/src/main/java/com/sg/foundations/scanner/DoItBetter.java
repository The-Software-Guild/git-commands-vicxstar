package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Scanner
 * 
 */
public class DoItBetter {
    
    public static void main(String[] arg) {

        //declare the varaibles:
        double miles;
        int hotD;
        int AhotD = 5;
        int lang;
        
        //declare and initialize the Scanner:
        Scanner inputReader = new Scanner(System.in);
        
        //get input from the user and store it in the already declared variables from above:
        System.out.print("How many miles can you run?: ");
        miles = Integer.parseInt(inputReader.nextLine());
        System.out.println();
        
        //print:
        System.out.println("Really? That's amazing! I can only run " + (miles - 2) + " miles");
        System.out.println();
        
        //get input from the user and store it in the already declared variables from above:
        System.out.print("How many hot dogs can you eat in one go?: " );
        hotD = Integer.parseInt(inputReader.nextLine());
        System.out.println();
        
        //print:
        System.out.println("Ha! Pathetic! I can eat " + AhotD + " hot dogs!");
        System.out.println("That's " + (AhotD - hotD)+ " more hotdogs than you!");
        System.out.println();
        
        //get input from the user and store it in the already declared variables from above:
        System.out.print("How many languages do you know?: ");        
        lang = Integer.parseInt(inputReader.nextLine());
        System.out.println();
        
        //print:
        System.out.println("Wow! I only know " + (lang / 2) + " languages!");
        
    }
}
