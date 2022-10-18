package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - for
 * 
 */
public class TraditionalFizzBuzz {
    
    public static void main(String[] args) {
        
        //print a statement:
        System.out.println("How many units of fizzing and buzzing do you need in your life?: ");
        
        //declare and initalise the scanner:
        Scanner fbScanner = new Scanner(System.in);
        
        //declare an integer variable which takes input from the user:
        int stop = fbScanner.nextInt();
        
        //create a 'for' loop that adds 1 to 'i' as the loop runs if 'i' is less than the value of 'stop' (users' input):
        for (int i = 0; i <= stop; i++) {
            
            //create an 'if' statement to print:
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
                
            } else if ( i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
                
            } else {
                System.out.println(i);
            }
            
        }
        //print once the number set by user has been fulfilled:
        System.out.println("TRADITION!!!");
    }
    
}
