package com.sg.foundations.basicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 14/10/2022
 * purpose: Rock Paper Scissors
 * 
 */
public class RockPaperScissors {
    
    public static void main(String[] args) {
        
        //declare and initialize the scanner to get user input:
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        //declare a variable to hold the deciscion to start and continue the game:
        String playAgain;
            
        //declare variables to count how many times the user wins, loose and draws:
        int win = 0 ;
        int draw = 0;
        int loose = 0;

        //put the computer's move into a variable:
        String aiMove;

        //make a loop to start the game: 
        while (true) {
            
            //ask the user if they would like to play (this starts and finishes the game and play again loop):
            System.out.println("Would you like to play? (type 'yes' or 'no')");
            
            //record the user's decision in the 'playAgain' variable:
            playAgain = in.nextLine();
               
            //create a statement to start the game if the user's input is 'yes':
            if (playAgain.equals("yes")) {
                
                //print a statement to explain the function of the game:
                System.out.println("This is a Rock, Paper, Scissors program");
                     
                //ask the user how many rounds they wants to play:
                System.out.println("Please enter the number of rounds would you like to play, between 1 and 10?");
                
                //get the user's input for the number of rounds they want to play:
                int rounds = Integer.parseInt(scanner.nextLine());

                //create statement to tell the system to end if the user inputs a value outside of 1 and 10:
                if (rounds < 1 || rounds > 10) {
                    System.out.println();
                    System.out.println("You did not enter a value between 1 and 10, so this program will now end.");
                    //break;
                }

                //create loop to play for the amount of time the user wants to play:
                for (int i = 0; i < rounds; i++) {

                    //get the user's game input:
                    System.out.println("Make your move! (Please type either: rock/paper/scissors to continue) ");
                    
                    //declare a varaible to store the user's input:
                    String uInput = scanner.nextLine();

                    //get a random number for the system's input:
                    Random random = new Random();
                    
                    //declare a varaible to store the system's random number (between 1 and 3) input:
                    int randNumber = random.nextInt(3);

                    //create a loop to assign 'rock', 'paper', and 'scissors' to numbers:
                    aiMove = switch (randNumber) {
                        case 0 -> "rock";
                        case 1 -> "paper";
                        default -> "scissors";
                    };
                    
                    //print the system's choice:
                    System.out.println("The system chose: " + aiMove);

                    //create 'if' statement to compare the system's input to the user's input and print the results:
                    if (uInput.equals(aiMove)) {
                        
                        //print statement and increase the 'draw' variable by '1' if the comparison is the same:
                        System.out.println("Very close!It's a draw!");
                        draw++;
                        System.out.println();
                        
                    } else if (UWins(uInput, aiMove)) {
                        //print statement and increase the 'win' variable by '1' if the comparison shows that the user's input is higher:
                        System.out.println("Well done! You've beat the system and won!");
                        win++;
                        System.out.println();

                    } else {
                        //print statement and increase the 'winn' variable by '1' if the comparison shows that the user's input is lower:
                        System.out.println("Too bad. You weren't good enough to beat the system. You've lost!");
                        loose++;
                        System.out.println();
                        }

             
            }

            //print how many times they won, lost or had a draw:
            System.out.println("Well done for playing! Here are your results:");
            System.out.println();
            System.out.println("You won " + win + " rounds.");
            System.out.println("You tied " + draw + " rounds.");
            System.out.println("You lost " + loose + " rounds.");
            System.out.println();
            
                }
            
            //create a statement to end the game if the user's input is 'no':
            else if (playAgain.equals("no")) {
                System.exit(0);
                }
        }
        
    }
    
    //create a new class for if the user wins:
    static boolean UWins(String uInput, String aiMove) {
        if (uInput.equals("rock")) {
            return aiMove.equals("scissors");
        } else if (uInput.equals("paper")) {
            return aiMove.equals("rock");
        } else {
            return aiMove.equals("paper");
        }
    }
    
}

 
