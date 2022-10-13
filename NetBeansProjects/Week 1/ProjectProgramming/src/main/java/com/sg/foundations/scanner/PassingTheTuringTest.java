package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Scanner
 * 
 */
public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        
        //declare the varaibles:
        //String Uname,Aname, Ucolour, Acolour, Cconvo, Ufood, Afood, Anum, calc, bye;
        String Aname, Acolour, Cconvo, Ufood, Afood, numb, calc, bye;
        int Unum, num, Anum, Ccalc;
        
        //declare String variables to hold the user's inputs:
        String stringUname;
        String stringUcolour;
        String stringUfood;
        String stringUnum;
        
        //declare and initialize the Scanner:
        Scanner myScanner = new Scanner(System.in);
        
        //get input from the user:
        System.out.println("Welcome to the Turing Test. To start, please enter your name: ");
        stringUname = myScanner.nextLine();
        System.out.println();
        
        Aname = "Hi, " + stringUname + " , my name is Vic!";
        System.out.println(Aname);
        System.out.println();
        
        System.out.println("What's your favourite colour: ");
        stringUcolour = myScanner.nextLine();
        System.out.println();
        
        Acolour = "Wow! " + stringUcolour + " is such a nice colour. Mine is blue";
        System.out.println(Acolour);
        System.out.println();
        
        Cconvo = "It's so z" + stringUcolour + " to meetcha!";
        System.out.println(Cconvo);
        System.out.println();
        
        System.out.println("What's your favourite food: ");
        stringUfood = myScanner.nextLine();
        System.out.println();
        
        Afood = "Yum! " + stringUfood + " sounds so yummy";
        System.out.println(Afood);
        System.out.println();
        
        System.out.println("So, what's your favourite number: ");
        stringUnum = myScanner.nextLine();
        System.out.println();
        
        num = 15;
        Unum = (int) Float.parseFloat(stringUnum);
        
        numb = "Really? " + Unum + " is such an average number. Mine is " + num;
        System.out.println(numb);
        System.out.println();
        
        Ccalc = Unum - num;
        
        calc = "Did you know " + stringUnum + " - " + num + " is " + Ccalc + "?";
        System.out.println(calc);
        System.out.println();
        
        bye = "Well, thanks for speaking with me " + stringUname + ". Have a great day!";
        System.out.println(bye);
        //Anum = (int) Float.parseFloat(num);
        //Ccalc = Unum - num;
        
        //now give a couple of them some values:
        //Aname = "Hi, " + stringUname + " , my name is Vic!";
        //Acolour = "Wow! " + stringUcolour + " is such a nice colour. Mine is blue";
        //Cconvo = "It's so z" + stringUcolour + " to meetcha!";
        //Afood = "Yum! " + stringUfood + " sounds so yummy";
        //num = 15;
        //numb = "Really? " + Unum + " is such an average number. Mine is " + num;
        //Ccalc = Unum - num;
        //calc = "Did you know " + stringUnum + " - " + num + " is " + Ccalc + "?";
        //bye = "Well, thanks for speaking with me " + stringUname + ". Have a great day!";
    }
    
}
