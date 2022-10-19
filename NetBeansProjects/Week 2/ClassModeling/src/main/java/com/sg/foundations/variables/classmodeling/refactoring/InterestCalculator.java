package com.sg.foundations.variables.classmodeling.refactoring;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 19/10/2022
 * purpose: Refactoring Interest Calculator
 * 
 */
public class InterestCalculator {
    
    //the method:
    //declare the variables required (need this to make sure class reads user's input):
    public int IntCalc(double principle, int years, double interest, int comp) {
        
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
        
        return 0; 
    }
    
}
