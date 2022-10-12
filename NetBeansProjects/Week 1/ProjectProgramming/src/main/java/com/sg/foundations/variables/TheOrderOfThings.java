package com.sg.foundations.variables;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Variables
 * 
 */
public class TheOrderOfThings {
    
    public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME ";
        size = "This teensy-weensy";
        age = "new ";
        shape = "weird";
        color = "yellow ";
        origin = "sentence";
        material = "makes ";
        purpose = "no";

        noun = "sense";

        //using the + with strings doesn't add -- it concatenates! (sticks them together):
        System.out.println(number + " " + opinion + size + " " + age + shape + " "
                 + color + origin + " " + material + purpose + " " + noun);
    }
    
}
