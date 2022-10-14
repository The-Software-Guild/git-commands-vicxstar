package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Variables
 * 
 */
public class BestAdderEver {
    
    public static void main(String[] args) {
        
        //declare all the variables:
        int a, b, c, d;
        
        //declare String variables to hold the user's input:
        String stringA;
        String stringB;
        String stringC;
        
        //declare and initialize the Scanner:
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("This is an adder.");
        System.out.println();
        
        System.out.println("Please enter a number: ");
        stringA = myScanner.nextLine();
        
        System.out.println("Please enter another number: ");
        stringB = myScanner.nextLine();
        
        System.out.println("Please enter yet another number: ");
        stringC = myScanner.nextLine();
        
        a = (int) Float.parseFloat(stringA);
        b = (int) Float.parseFloat(stringB);
        c = (int) Float.parseFloat(stringC);
        
        d = a + b + c;
        
        System.out.println("Your inputs were: " + a + ", "+ b + ", " + c);
        System.out.println("They equal: " + d);
        
                
    }
    
}
