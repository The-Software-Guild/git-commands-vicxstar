package com.sg.foundations.variables.classmodeling.refactoring;

import java.util.Random;

/**
 *
 * @author vic 
 * email: vickiayoade@gmail.com 
 * date: 19/10/2022 
 * purpose: Refactoring Lucky Sevens
 *
 */
public class LuckySevens {

    //the method:
    //declare the variables required (need this to make sure class reads user's input):
    public int luck(int dollars) {

        //declare the variables:
        int rolls = 0, maxRolls = 0, moneys = dollars;

        //declare the randomiser:
        Random dice = new Random();

        //create a loop to iterate until the value in the 'dollars' variable is finished:
        while (dollars > 0) {

            //decalre a random number between 1 and 6 for the dice:
            int roll1 = dice.nextInt(7);
            int roll2 = dice.nextInt(7);

            //use an 'if' statement to iterate through the random numbers:
            if (roll1 + roll2 == 7) {
                int wins = 4;

                //increase the value of 'dollars' with the value of 'wins':
                dollars += wins;

                //count the number of rolls:
                rolls++;

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
                rolls++;
            }
        }

        //print:
        System.out.println("You were broke after: " + rolls + " rolls");
        System.out.println("You should have quit after " + maxRolls + " when you had $" + moneys);
        return 0;
    }

}
