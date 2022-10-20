package com.sg.foundations.variables.classmodeling.refactoring;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com 
 * date: 20/10/2022 
 * purpose: Refactored Rock Paper Scissors
 *
 */
public class RoPaScApp {
    
    public static void main(String[] args) {
        
        //declare and initialize the scanner to get user input:
        Scanner in = new Scanner(System.in);
        
        //declare a variable to hold the deciscion to start and continue the game:
        String playAgain;
        
        //make a loop to start the game: 
        while (true) {
            
            //ask the user if they would like to play (this starts and finishes the game and play again loop):
            System.out.println("Would you like to play? (type 'yes' or 'no')");
            
            //record the user's decision in the 'playAgain' variable:
            playAgain = in.nextLine();
            
            //declare a new instance of the 'RockPaperScissors' class called 'newGame':
            RockPaperScissors newGame = new RockPaperScissors();
            
            //run the 'luck' method from the 'LuckySevens' class in new 'newLuck' instance using the users inputs:
            newGame.Game(playAgain);
            
        }
    
    }
}
