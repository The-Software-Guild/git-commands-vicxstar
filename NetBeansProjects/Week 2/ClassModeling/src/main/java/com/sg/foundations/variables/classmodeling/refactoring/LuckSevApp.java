package com.sg.foundations.variables.classmodeling.refactoring;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vic 
 * email: vickiayoade@gmail.com 
 * date: 19/10/2022 
 * purpose: Refactored Lucky Sevens
 *
 */
public class LuckSevApp {

    public static void main(String[] args) {

        //decalre the scanner:
        Scanner userIn = new Scanner(System.in);

        //print the statements and declare the variables:
        System.out.println("How many dollars do you have?: ");
        String sDollars = userIn.nextLine();
        //convert the string into an integer and store it in a new variable:
        int dollars = Integer.parseInt(sDollars);
        System.out.println();

        //declare a new instance of the 'LuckySevens' class called 'newLuck':
        LuckySevens newLuck = new LuckySevens();

        //run the 'luck' method from the 'LuckySevens' class in new 'newLuck' instance using the users inputs:
        newLuck.luck(dollars);

    }
}
