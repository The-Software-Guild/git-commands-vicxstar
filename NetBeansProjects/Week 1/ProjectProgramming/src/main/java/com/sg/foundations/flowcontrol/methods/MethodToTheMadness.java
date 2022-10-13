package com.sg.foundations.flowcontrol.methods;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Methods
 * 
 */
public class MethodToTheMadness {
    
    public static void main(String[] args) {
        
        //declare the methods:
        eatMe();
        drinkMe();

        System.out.println("\n ― Lewis Carroll, Alice in Wonderland");
    }

    //call the method 'eatme()':
    static void eatMe(){
        System.out.println(" 'But I don’t want to go among mad people,' Alice remarked.");
        System.out.println();
        System.out.println(" 'Oh, you can’t help that,' said the Cat.");
        System.out.println();
        System.out.print(" 'We’re all mad here. I’m mad. You’re mad.'");
        System.out.println();
    }

    //call the method 'drinkme()':
    static void drinkMe(){
        System.out.println(" 'How do you know I’m mad?' said Alice.");
        System.out.println();
        System.out.println(" 'You must be,' said the Cat, 'or you wouldn’t have come here.' ");
    }
    
}
