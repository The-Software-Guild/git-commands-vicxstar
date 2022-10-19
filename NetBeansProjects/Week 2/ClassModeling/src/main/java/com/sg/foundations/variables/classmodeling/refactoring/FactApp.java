package com.sg.foundations.variables.classmodeling.refactoring;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 19/10/2022
 * purpose: Refactored Factorizer App
 * 
 */
public class FactApp {
    
    public static void main(String[] args) {
    
        //declare all the variables:
        int uNum;
        
        //declare String variables to hold the user's input:
        String stringNum;
        
        //declare and initialize the Scanner:
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("This is a factoriser. It tells you some information about an inputted number.");
        System.out.println();
        
        //1. ask user for input:
        System.out.println("What number would you like to factor?: ");
        stringNum = myScanner.nextLine();
        uNum = (int) Float.parseFloat(stringNum);
        
        //2. print out user's input:
        System.out.println("This is the number you inputted: " + uNum);
        
        //declare a new instance of the 'Factorizer' class called 'fact':
        Factorizer fact = new Factorizer();
        
        //run the 'Factorizer' method from the 'Factorizer' class in new 'fact' instance using input called 'uNum':
        fact.Factorizer(uNum);
                
    }
}
