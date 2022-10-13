package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 13/10/2022
 * purpose: Flow Control - ifs
 * 
 */
public class MiniZork {
    
    public static void main(String[] args) {

        //declare and initialize the Scanner:
        Scanner userInput = new Scanner(System.in);

        //print:
        System.out.println("You are standing in an open field west of a white house, with a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");
        System.out.println();

        //get input from the user:
        String action = userInput.nextLine();

        //declare the 'if' statement and start the loop:
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();
            System.out.println();

            //make another statement to continue depending on what the user chose:
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();
                System.out.println();

                //make another statement to continue depending on what the user chose:
                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a goblin.");
                    
                //make an 'else' statement to do something else depending on what the user chose:
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            }

            //make another statement to continue depending on what the user chose:
            if (action.equals("stick your hand in")) {
                System.out.println("You feel something small and scally.");
                System.out.println("It slithers in between your fingers");
                System.out.print("Do you remove your hand? Or grab the moving object? ");
                action = userInput.nextLine();
                System.out.println();

                //make another statement to continue depending on what the user chose:
                if (action.equals("grab the moving object")) {
                    System.out.println("It is a snake and it looks pissed!");
                    System.out.println("It bites you!");
                    
                //make an 'else' statement to do something else depending on what the user chose:
                } else if (action.equals("remove your hand")) {
                    System.out.println("There is blood streaming down your hand.");
                    System.out.println("It's a good thing you removed your hand! I wonder what was inside...");
                }

            }

            //make an 'else if' statement to do something else depending on what the user chose:
        } else if (action.equals("go to the house")) {
            System.out.println("You notice a car in front of the house ");
            System.out.println("You hear screams coming from inside and panic");
            System.out.println("You slowly creep towards the door and peak through a small crack in the door");
            System.out.println("Step inside the house or run away?");
            action = userInput.nextLine();
            System.out.println();

            //make another statement to continue depending on what the user chose:
            if (action.equals("step inside the house")) {
                System.out.println("You see a woman lying on the floor with a puddle of bloodsurrounding her body.");
                System.out.println("You shear police sirens coming from outside");
                System.out.println("The police burst through the door and arrest you for murder");
                System.out.println("You should have just run away");
                
            //make an 'else if' statement to do something else depending on what the user chose:
            } else if (action.equals("run away")) {
                System.out.println("As you're running away, you hear police sirens coming from a distance");
                System.out.println("I wonder why the police are coming...");
            }

        }

        }
    }
    
