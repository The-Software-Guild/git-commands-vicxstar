package com.sg.foundations.exercises.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 18/10/2022
 * purpose: Interest Calculator
 * 
 */
public class InterestCalculator {
    
    public static void main(String[] args) {
        
        //declare the variables:
        String sInvest, sYears, sInterestRate;
        double invest, interestRate, sum;
        int years;
        double earned = 0, end = 0;
        
        //decalre the scanner:
        Scanner userIn = new Scanner(System.in);
        
        //print a statement asking for user input:
        //how much to invest:
        System.out.println("How much do you want to invest?: ");
        //add input into the 'invest' variable:
        sInvest = userIn.nextLine();
        //convert input:
        invest = Double.parseDouble(sInvest);
        
        //how many investment years:
        System.out.println("How many years are investing?: ");
        //add input into the 'years' variable:
        sYears = userIn.nextLine();
        //convert input:
        years = Integer.parseInt(sYears);
        
        //what is the interest rate?:
        System.out.println("What is the annual interest rate % growth?: ");
        //add input into the 'interestRate' variable:
        sInterestRate = userIn.nextLine();
        //convert input:
        interestRate = Double.parseDouble(sInterestRate)/100;
        
        
        //print:
        System.out.println("Calculating... ");
        
        //call the method and add the variables for it to function on:
        compIntCalc(invest, years, interestRate, 4);
        
        
    }
    
    //the calculation method:
    //the varaibles to calculate on:
    public static void compIntCalc(double principle, int years, double interest, int comp) {
        
        //create a 'for' loop to iterate through until the conditions have been met
        for (int i = 1; i <= years; i++) {
            
            //using the 'Math' method:
            double total = Math.floor((principle * (Math.pow(1 + (interest/comp), comp * 1))) 
                    * 100) / 100;
            //double total = principle * (Math.pow((1 + interest / 100), year)) - pri;
            double compInt = Math.floor((total - principle) * 100) / 100;
            
            //print statements:
            System.out.println("Year " + i + ": ");
            System.out.println("Began with $" + principle);
            System.out.println("Earned $" + compInt);
            System.out.println("Ended with $" + total);  
            System.out.println("");
            
            Math.floor(((principle += compInt) * 100) / 100);
        }  
    }
    
}
