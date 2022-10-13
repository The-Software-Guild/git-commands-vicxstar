package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Methods
 * 
 */
public class BarelyControlledChaos {
    
    public static void main(String[] args) {

        //call color method here:
        String color = randomColour();
        //call animal method here:
        String animal = randomAnimal(); 
        //call colour method again here:
        String colorAgain = randomColour(); 
        //call number method with a range between 5 - 200:
        int weight = randomNumber(5, 200); 
        //call number method with a range between 10 - 20:
        int distance = randomNumber(10, 20);
        //call number method with a range between 10000 - 20000:
        int number = randomNumber(10000, 20000);
        //call number method with a range between 2 - 6: 
        int time = randomNumber(2, 6);            

        System.out.println("Once, when I was very small...");
        System.out.println();

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");
        System.out.println();

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    //method 1:
    public static String randomColour(){
        String[] colours = new String[] {"blue", "red", "yellow", "green", "purple", "blakc", "white"};
        Random rng = new Random();  
        int randomIndex = rng.nextInt(colours.length);
        return colours[randomIndex];
    }
    //method 2:
    
    public static String randomAnimal(){
        String[] animals = new String[] {"monkey", "cat", "dog", "tiger", "bear"};
        Random rng = new Random();  
        int randomIndex = rng.nextInt(animals.length);
        return animals[randomIndex];
    }
    //method 3:
    public static int randomNumber(int min, int max) {
        Random rng = new Random();
        int randomNumber = rng.nextInt(++max - min) + min;
        return randomNumber;
    }
}
