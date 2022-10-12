package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Variables
 * 
 */
public class AllAboutMe {
    
    public static void main(String[] args) {
        //declare ALL THE THINGS (your name, favorite food, how many pets you have, wwhat kind of building you live in):
        String name, favFood, pets, live, CanWhistle;
        
        //now give a couple of them some values:
        name = "Vic";
        favFood = "Ramen";
        pets = "No";
        live = "Apartment";
        CanWhistle = "No";
        
        //print them out:
        System.out.println("Hi! My name is " + name + " , I like to eat " + favFood + " , " + pets + " I do not have any pets, I live in an " + live + " and " + CanWhistle + " I cannot whistle");
        System.out.println("What about you?");
        
        //declare String variables to hold the user's inputs:
        String stringName;
        String stringFavFood;
        String stringPets;
        String stringLive;
        String stringCanWhistle;
        
        //declare and initialize the Scanner:
        Scanner myScanner = new Scanner(System.in);
        
        //get input from the user:
        System.out.println("Please enter your name:");
        stringName = myScanner.nextLine();
        
        System.out.println("Please enter your favourite food:");
        stringFavFood = myScanner.nextLine();
        
        System.out.println("Please enter the number of pets you have:");
        stringPets = myScanner.nextLine();
        
        System.out.println("Please enter the type of building you live in:");
        stringLive = myScanner.nextLine();
        
        System.out.println("Can you whistle? (type 'can' or 'cannot'):");
        stringCanWhistle = myScanner.nextLine();
        
        System.out.println("My name is " + stringName + " , I like to eat " + stringFavFood + " , I have " + stringPets + "  pets, I live in a " + stringLive + " and I " + stringCanWhistle + " whistle");
               
    }
    
}
