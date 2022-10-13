package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Scanner
 * 
 */
public class AllTheTrivia {
    
    public static void main(String[] arg) {
        
        //declare the varaibles:
        String a1, a2, a3, a4;
        
        //declare and initialize the Scanner:
        Scanner inputReader = new Scanner(System.in);

        //get input from the user and store it in the already declared variables from above:
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        a1 = inputReader.nextLine();

        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        a2 = inputReader.nextLine();

        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        a3 = inputReader.nextLine();

        System.out.println("What is the most abundant element in the earth's atmosphere?");
        a4 = inputReader.nextLine();

        //print:
        System.out.println("I didn't know that the largest ever volcano is " + a4 + "!");
        System.out.println(a1 + " is the only planet that rotates clockwise!");
        System.out.println(a3 + " is the most abundant element in the atmosphere!");
        System.out.println("Wow, 1024 GB is a " + a2 + "!");
        
    }
}
