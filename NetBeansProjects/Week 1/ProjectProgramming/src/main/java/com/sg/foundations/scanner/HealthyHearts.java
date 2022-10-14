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
public class HealthyHearts {
    
    public static void main(String[] arg) {
        
        //declare the varaibles:
        int age;

        //declare String variables to hold the user's input:
        String stringAge;

        //declare and initialize the Scanner:
        Scanner inputReader = new Scanner(System.in);

        //get input from the user and store it in the already declared variables from above:
        System.out.println("How old are you?: ");
        stringAge = inputReader.nextLine();
        age = Integer.parseInt(stringAge);
        System.out.println();

        //print:
        System.out.println("Your maximum heart rate should be " + (220 - age) + " beats per minute.");
        System.out.println();
        System.out.println("Your target HR Zone should be between " + (220 - age) * 0.5 + " - " + (220 - age) * 0.85 + " beats per minute.");
        System.out.println();
    }

}
