package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - ifs
 * 
 */
public class LlamasWhalesAndDodosOhMy {
    
    public static void main(String[] args) {
        
        //declare the varaibles:
        int llamas = 20;
        int whales = 15;
        int dodos = 0;

        //declare the 'if' statement and start the loop:
        if (dodos > 0) {
            System.out.println("Egads, I thought dodos were extinct!");
        }

        //make another 'if' statement to continue depending on whether the condition has been satisfied or not:
        if(dodos < 0){
            System.out.println("Hold on, how can we have NEGATIVE dodos??!");
        }

        if(llamas > whales){
            System.out.println("Whales may be bigger, but llamas are better, ha!");
        }

        if(llamas <= whales){
            System.out.println("Aw man, brawn over brains I guess. Whales beat llamas.");
        }

        System.out.println("There's been a huge increase in the dodo population via cloning!");
        dodos += 100;

        if( (whales + llamas) < dodos){
            System.out.println("I never thought I'd see the day when dodos ruled the earth.");
        }

        if(llamas > whales && llamas > dodos){
            System.out.println("I don't know how, but the llamas have come out ahead! Sneaky!");
        }
    }
    
}
