package com.sg.foundations.variables.basicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vic
 * date: 14/10/2022
 * purpose: Dog Genetics
 * 
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        
        //declare and initialize the scanner to get user input:
        Scanner in = new Scanner(System.in);
        
        //get a random number and put it into a variable:
        Random random = new Random();
        
        //declare the variables:
        String dogName;
        
        //a maximum value:
        int max = 101;
        
        //make the breeds equal the maximum value take away the value of the previous variable:
        int breed1 = random.nextInt(max);
        int breed2 = random.nextInt(max - breed1);
        int breed3 = random.nextInt(max - breed1 - breed2);
        int breed4 = random.nextInt(max - breed1 - breed2 - breed3);
        int breed5 = random.nextInt(max - breed1 - breed2 - breed3 - breed4);
        
        //make sum equal '0':
        int sum = 100 - breed1 - breed2 - breed3 - breed4 - breed5;
        
        //put breed percentages and sum into list:
        int[] perct = new int[] {breed1, breed2, breed3, breed4, breed5, sum};
        
        //put breed types into list:
        String[] breed = new String[]{"Bulldog", "Pitbull", "Golden Retriever", "Siberian Husky", "Chihuahua"};
        
        //print a statement to explain the function of the programme:
        System.out.println("This is a dog genetics program. It will tell you some information about your dog.");
        
        //ask for user input:
        System.out.println("What is your dog's name?");
        
        //record the user's input in the 'dogName' variable:
        dogName = in.nextLine();
          
        System.out.println("Well then, I have this highly reliable report on" + dogName + "prestigious background right here.");
        System.out.println();
        System.out.println(dogName + " is: ");
        System.out.println();
        
        //create loop to keep generating numbers untill they add up to 100:
        for (int i = 0; i < 5; ++i) {
            
            System.out.println(perct[i] + "% " + breed[i]);
        }
        
        System.out.println("\nWow, that's QUITE the dog!");
    }
    
}
