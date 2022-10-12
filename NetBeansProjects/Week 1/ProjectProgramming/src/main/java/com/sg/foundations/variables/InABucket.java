package com.sg.foundations.variables;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Variables
 * 
 */
public class InABucket {
    
    public static void main(String[] args) {

        //you can declare all KINDS of variables:
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;

        //but declaring them just sets up the space for data to use the variable, you have to put data IN it first:
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;

        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
    }
    
}
