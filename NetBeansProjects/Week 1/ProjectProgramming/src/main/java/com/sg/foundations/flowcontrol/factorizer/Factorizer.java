package com.sg.foundations.flowcontrol.factorizer;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Factorizer
 * 
 */
public class Factorizer {
    
    public static void main(String[] args) {
        
        //declare all the variables:
        int uNum, factCount = 0, perf = 0;
        
        //declare String variables to hold the user's input:
        String stringNum;
        
        //declare and initialize the Scanner:
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("This is a factoriser. It tells you some information about an inputted number.");
        
        //1. ask user for input:
        System.out.println("What number would you like to factor?: ");
        stringNum = myScanner.nextLine();
        
        uNum = (int) Float.parseFloat(stringNum);
        
        //2. print out user's input:
        System.out.println("This is the number you inputted: " + uNum);
        
        //3. print each factor of the input (not including the number):
        System.out.println("Factors of " + uNum + " are: ");
        //create a 'for' loop to run from 1 to the inputted number (uNum):
        for (int i = 1; i <= uNum; i++) {
            //check if number is divided by i (i is the factor):
            if (uNum % i == 0) {
                //add it onto the counter 'factCount':
                factCount++;
                
                //print out the value of 'i':
                System.out.print(i + " ");
                
            } //end of if statement
        }//end of 'for' loop
        
        //4. print out the total number of factors for the number:
        System.out.println();
        System.out.println(uNum + " has " + factCount + " factors.");
        
        //5. print out whether or not the number is perfect:
        //create a 'for' loop to run from 1 to the inputted number (uNum):
        for (int i = 1; i < uNum; i++) {
            //check if number is divided by i (i is the factor):
            if (uNum % i == 0) {
                
                //calculate the sum of factors:
                perf = perf + i;
                
                //print out the value of 'i':
                //System.out.print(i + " ");
                
            } //end of if statement
        }//end of 'for' loop
        
        //compare the variable 'perf' with the 'uNum':  
        if(perf == uNum) {  
        //prints if 'perf' and 'uNum are equal:
            System.out.println(uNum+" is a perfect number.");  
            } //end of 'if' statement
        else { 
        //prints if 'perf' and 'uNum are not equal:
            System.out.println(uNum+" is not a perfect number.");
            } //end of 'else' statment
        
        //6. print out whether or not the number is prime:
        
        
        if(isPrime(uNum)) {
            System.out.println(uNum + " is prime number");
        }
        else{
            System.out.println(uNum + " is not a prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
        
        
    } 
