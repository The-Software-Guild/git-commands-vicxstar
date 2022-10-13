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
public class MiniMadLibs {
    
    public static void main (String[] args) {
        
        //declare the varaibles:
        String noun1, noun2, ad1, ad2, plNoun1, plNoun2, plNoun3, verb1, verb2;
        int num;
        
        //declare and initialize the Scanner:
        Scanner inputReader = new Scanner(System.in);
        
        //get input from the user and store it in the already declared variables from above:
        System.out.println("Let's play MAD LIBS! ");
        System.out.println();
        
        System.out.print("I need a noun: ");
        noun1 = inputReader.nextLine();
        System.out.println();
        
        System.out.print("Now an adjective: ");
        ad1 = inputReader.nextLine();
        System.out.println();

        System.out.print("I need another noun: ");
        noun2 = inputReader.nextLine();
        System.out.println();

        System.out.print("And a number please: ");
        num = Integer.parseInt(inputReader.nextLine());
        System.out.println();

        System.out.print("Yet another adjective please: ");
        ad2 = inputReader.nextLine();
        System.out.println();

        System.out.print("Now, a plural noun: ");
        plNoun1 = inputReader.nextLine();
        System.out.println();
        
        System.out.print("Yet another one please: ");
        plNoun2 = inputReader.nextLine();
        System.out.println();
        
        System.out.print("Just one more: ");
        plNoun3 = inputReader.nextLine();
        System.out.println();
        
        System.out.print("I need a present tense verb please: ");
        verb1 = inputReader.nextLine();
        System.out.println();
        
        System.out.print("I now need that same verb but in the past tense please: ");
        verb2 = inputReader.nextLine();
        System.out.println();

        //print:
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println();
        System.out.print(noun1 + ": the " + ad1 + " frontier. These are the voyages of the starship " + noun2 +
                ". Its a " + num + " " + "- year mission: to explore strange " + ad2 + " " + plNoun1 + ", to seek out "
                + ad2 + " " + plNoun2 + " and " + ad2 + " " + plNoun3 + ", and to boldly " + verb1 + " where no one has "
                + verb2 + " before.");
        }
    
}
