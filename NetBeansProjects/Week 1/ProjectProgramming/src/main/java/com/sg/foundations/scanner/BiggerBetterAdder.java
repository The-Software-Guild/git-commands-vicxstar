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
public class BiggerBetterAdder {
    
    public static void main(String[] arg) {
        
        //declare the varaibles:
        //String mult, sub;
        double miles;
        int hotD, lang, Imult, iSub;
        
        //declare and initialize the Scanner:
        Scanner inputReader = new Scanner(System.in);
        
        //declare String variables to hold the user's inputs:
        String stringMult;
        String stringSub;
        
        //get input from the user and store it in the already declared variables from above:
        System.out.print("How many miles can you run?: ");
        miles = Integer.parseInt(inputReader.nextLine());
        System.out.println();
        System.out.print("How many hot dogs can you eat in one go?: " );
        hotD = Integer.parseInt(inputReader.nextLine());
        System.out.println();
        System.out.print("How many languages do you know?: ");        
        lang = Integer.parseInt(inputReader.nextLine());
        System.out.println();
        System.out.println("Give me a number to multiply with?");
        stringMult = inputReader.nextLine();
        Imult = Integer.parseInt(stringMult);
        System.out.println();
        System.out.println("Give me a number to subtract with?");
        stringSub = inputReader.nextLine();
        iSub = Integer.parseInt(stringSub);
        System.out.println();
        
        //print:
        System.out.println("I can run approximately, " + (miles * Imult - iSub) + " less miles than you");
        System.out.println();
        System.out.println("I can eat about " + (hotD * Imult - iSub) + " more hot dogs than you");
        System.out.println();
        System.out.println("And, I actually know " + (lang * Imult - iSub) + " languages");
        System.out.println();

    }
}
