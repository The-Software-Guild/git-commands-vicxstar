package com.sg.foundations.variables.classmodeling.refactoring;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 19/10/2022
 * purpose: Refactoring Factorizer
 * 
 */
public class Factorizer {
    
    //the method:
    //declare the variables required (need this to make sure class reads user's input):
    public int Factorizer(int uNum) {
        
        //declare the counter variables:
        int factCount = 0, perf = 0;
        
        //print each factor of the input (not including the number):
        System.out.println("Factors of " + uNum + " are: ");
        
        //create a 'for' loop to check the factors of the inputted num :
        for (int i = 1; i <= uNum; i++) {
            //check if number is divided by i (i is the factor):
            if (uNum % i == 0) {
                //add it onto the counter 'factCount':
                factCount++;
                
                //print out the value of 'i':
                System.out.print(i + " ");
                
            } //end of if statement
        }//end of 'for' loop
        
        //print out whether or not the number is perfect:
        //create another 'for' loop to check if the inputted num is perfect:
        for (int i = 1; i < uNum; i++) {
            //check if number is divided by i (i is the factor):
            if (uNum % i == 0) {
                
                //calculate the sum of factors:
                perf = perf + i;
                
            } //end of if statement
        }//end of 'for' loop
        
        //print out the total number of factors for the number:
        System.out.println();
        System.out.println(uNum + " has " + factCount + " factors.");
        
        //compare the variable 'perf' with the 'uNum':  
        if(perf == uNum) {  
        //prints if 'perf' and 'uNum are equal:
            System.out.println(uNum+" is a perfect number.");  
            } //end of 'if' statement
        else { 
        //prints if 'perf' and 'uNum are not equal:
            System.out.println(uNum+" is not a perfect number.");
            } //end of 'else' statment
        
        if(isPrime(uNum)) {
            System.out.println(uNum + " is prime number");
        }
        else{
            System.out.println(uNum + " is not a prime number");
        }
        return factCount;
    }
    
        
    static  boolean isPrime(int num) {
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

