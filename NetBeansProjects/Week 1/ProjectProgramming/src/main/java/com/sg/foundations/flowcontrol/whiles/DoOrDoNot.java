package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - do-while
 * 
 */
public class DoOrDoNot {
    
    public static void main(String[] args) {

        //declare and initalise the scanner:
        Scanner input = new Scanner(System.in);
        
        //print:
        System.out.println("Should I do it? (y/n): ");
        
        //declare a boolean varibale:
        boolean doIt;

        //use an 'if' statement to tell the code what to do:
        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        //declare another boolean varibale and assign a 'false' value to it:
        boolean iDidIt = false;

        //create a 'do - while' loop:
        do {
            iDidIt = true;
            break;
        } while (doIt);

        //another 'if' statement:
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
    
}
