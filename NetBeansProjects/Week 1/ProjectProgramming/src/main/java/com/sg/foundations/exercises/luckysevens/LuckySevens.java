package com.sg.foundations.exercises.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 18/10/2022
 * purpose: Lucky Sevens
 * 
 */
public class LuckySevens {
    
    public static void main(String[] args) {
        
        //decalre the scanner:
        Scanner userIn = new Scanner(System.in);
        
        //print the statements and declare the variables:
        System.out.println("How many dollars do you have?: ");
        String sDollars = userIn.nextLine();
        //convert the string into an integer and store it in a new variable:
        int dollars = Integer.parseInt(sDollars);
        System.out.println();
        
        //declare the randomiser:
        Random dice = new Random();
        
        //declare the variables:
        int rolls = 0, maxRolls = 0, moneys = dollars;
        
        //create a loop to iterate until the value in the 'dollars' variable is finished:
        while(dollars > 0){
            
            //decalre a random number between 1 and 6 for the dice:
            int roll1 = dice.nextInt(7);
            int roll2 = dice.nextInt(7);
            
            //use an 'if' statement to iterate through the random numbers:
            if (roll1 + roll2 == 7) {
                int wins = 4;
                
                //increase the value of 'dollars' with the value of 'wins':
                dollars += wins;
                
                //count the number of rolls:
                rolls ++;
                
                //use an 'if' statement to check the amount left:
                if (wins + moneys >= moneys) {
                    
                    //increase the value of 'moneys' with the value of 'wins':
                    moneys += wins;
                    maxRolls = rolls;
                }
                
                //otherwise, count the amount of time the user lost:
            } else {
                int lost = 1;
                dollars -= lost;
                rolls ++;
            }
        }
        
        //print:
        System.out.println("You were broke after: " + rolls + " rolls");
        System.out.println("You should have quit after " + maxRolls + " when you had $" + moneys);
            
        }
    
    }
