package com.sg.foundations.variables.classmodeling.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date:20/10/2022
 * purpose: Simple Calculator App
 * 
 */
public class SimpCalcApp {
    
    public static void main(String[] args) {
        
        //declare and initialize the scanner to get user input for the exit:
        Scanner startInput = new Scanner(System.in);
        
        //declare the variable to start the program:
        String start;
        
        //ask the user if they would like to start (this starts and finishes the program):
        System.out.println("Would you like to start the program? (type 'yes' or 'no'): ");

        //record the user's decision in the 'start' variable:
        start = startInput.nextLine();
        
        //make a loop to start the program if the user's input is 'yes': 
        while (start.equals("yes")) {
            
            //declare and initialize the scanner to get user input for the program:
            Scanner input = new Scanner(System.in);
            
            //declare the variables:
            char sign;
            int num1;
            int num2;
            
            //ask the user to enter their first number:
            System.out.println("Please enter the first number: ");
            num1 = input.nextInt();
            
            //ask the user to choose an operator:
            System.out.println("Please choose an operator to calculate with (+, -, *, or /): ");
            //return the character at the specified index of the input:
            sign = input.next().charAt(0);
            
            //ask the user to enter their second number:
            System.out.println("Please enter the second number: ");
            num2 = input.nextInt();
            
            //declare a new instance of the 'SimpleCalculator' class called 'newCalc':
            SimpleCalculator newCalc = new SimpleCalculator();
            
            //run the 'calc' method from the 'SimpleCalculator' class in new 'newCalc' instance using the users inputs:
            newCalc.calc(start, sign, num1, num2);
            
        }
        
        //a statement to end the program if the user's input is 'no':
        if (start.equals("no")) {
            System.out.println();
            //print a 'goodbye' message
            System.out.println("Goodbye!");
            //code to exit the program:
            System.exit(0);
            
        }
    }
}   