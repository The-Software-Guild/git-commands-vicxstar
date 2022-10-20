package com.sg.foundations.variables.classmodeling.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author vic 
 * email: vickiayoade@gmail.com 
 * date:20/10/2022 
 * purpose: Simple Calculator Class
 *
 */
public class SimpleCalculator {
    
    //the method:
    //declare the variables required (need this to make sure class reads user's input):
    public String calc(String start, char sign, int num1, int num2) {

            //declare the variables:
            int equals;
            
            //THE CALCULATION METHOD:
            switch (sign) {

                //to perform an addition:
                case '+':
                    equals = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + equals);
                    break;

                //to perform a subtraction:
                case '-':
                    equals = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + equals);
                    break;

                //to perform a multiplication:
                case '*':
                    equals = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + equals);
                    break;

                //to perform a divsion:
                case '/':
                    equals = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + equals);
                    break;

                //if the input is invalid:
                default:
                    System.out.println("Invalid operator!");
                    break;
            
            }
            
            //to give the user a choice to end the program:
            //declare the scanner:
            Scanner exitInput = new Scanner(System.in);
    
            //declare the exit variable:
            String exit;
    
            //ask the user if they would like to exit the program:
            System.out.println("Would you like to exit the program? (type 'yes' or 'no'): ");
            //record the user's decision in the 'exit' variable:
            exit = exitInput.nextLine();
            
            //use an 'if' statement to exit the program is the user's input is 'yes':
            if (exit.equals("yes")) {
                System.out.println();
                //print a 'thank you' message
                System.out.println("Thank you for  using the Simple Calculator. Goodbye!!");
                //code to exit the program:
                System.exit(0);
            
        } 
        
        return null;
    }
}
