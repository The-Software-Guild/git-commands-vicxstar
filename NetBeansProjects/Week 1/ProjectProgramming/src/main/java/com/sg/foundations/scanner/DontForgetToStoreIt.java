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
public class DontForgetToStoreIt {
    
    public static void main(String[] args) {

        //declare the varaibles:
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;

        //declare and initialize the Scanner:
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals: ");
        Double.parseDouble(inputReader.nextLine());

        //we've used Double.parseDouble but meaningOfLifeAndEverything is an INT so we'll have to use Integer.parseInt:
        System.out.println("What is the meaning of life, the universe & everything? ");
        Integer.parseInt(inputReader.nextLine());

        //get input from the user and store it in the already declared variables from above:
        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.nextLine();

        //print:
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
    }

}
