package com.sg.foundations.variables;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Variables
 * 
 */
public class MoreBucketsMoreFun {
    
    public static void main(String[] args) {

        //declare ALL THE THINGS (usually it's a good idea to declare them at the beginning of the program):
        int butterflies, beetles, bugs;

        //now give a couple of them some values:
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.print("There are only " + butterflies + " butterflies, ");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        bugs--;
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
        System.out.println("Ok, I've fixed it. There are now only " + bugs + " bugs left");
    }
    
}
