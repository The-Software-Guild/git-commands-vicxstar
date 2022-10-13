package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author vic
 * * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - random
 * 
 */
public class ALittleChaos {
    
    public static void main(String[] args) {

        //declare and initialize the randomizer:
        Random randomizer = new Random();

        //print a statement that uses the randomizer to generate a random integer:
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println();
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println();
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        System.out.println();

        //declare a varaible to store a random int between 1 and 100:
        int num = randomizer.nextInt(100);

        //print:
        System.out.println("You can store a randomized result: " + num);
        System.out.println();
        System.out.println("And use it over and over again: " + num + ", " + num);
        System.out.println();

        System.out.println("Or just keep generating new values");
        System.out.println();
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        //get a random int between 1 and 51:
        System.out.print(randomizer.nextInt(51));
        System.out.println();
        //get a random int between 1 and 101, then add 2 to it:
        System.out.print(randomizer.nextInt(101) + 2);
        System.out.println();
        //get a random int between 1 and 101 and subtract 100 from it:
        System.out.print(randomizer.nextInt(101) - 100);
        System.out.println();
        //get a random int between 1 and 100 and divide it by 3:
        System.out.print(randomizer.nextInt(100) / 2);
        System.out.println();
        //get a random int between 1 and 101 and multiply it by 2:
        System.out.print(randomizer.nextInt(101) * 2);
        System.out.println();
        //get a random int between 1 and 101:
        System.out.println(randomizer.nextInt(101));
    }
    
}
