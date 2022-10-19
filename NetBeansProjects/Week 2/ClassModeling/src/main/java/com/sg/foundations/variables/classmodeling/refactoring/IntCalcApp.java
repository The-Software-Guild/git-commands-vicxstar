package com.sg.foundations.variables.classmodeling.refactoring;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 19/10/2022
 * purpose: Refactored Interest Calculator
 */
public class IntCalcApp {
    
    public static void main(String[] args) {
        
        //declare the variables:
        String sInvest, sYears, sInterestRate;
        double invest, interestRate;
        int years;
        
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
        System.out.println();
        
        
        //print:
        System.out.println("Calculating... ");
        
        //declare a new instance of the 'InterestCalculator' class called 'newCalc':
        InterestCalculator newCalc = new InterestCalculator();
        
        //run the 'IntCalc' method from the 'InterestCalculator' class in new 'newCalc' instance using the users inputs:
        newCalc.IntCalc(invest, years, interestRate, 4);
        
    }
}
