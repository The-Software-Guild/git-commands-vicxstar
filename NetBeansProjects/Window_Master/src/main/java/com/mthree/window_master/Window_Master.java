package com.mthree.window_master;

import java.util.Scanner;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Window Master Exercises
 * 
 */
public class Window_Master {

    public static void main(String [] args) {
    
    //while (true) {
        
        //declare variables for height, width, cost of windows, trim and number of windows:
        float height;
        float width;
        float Wcost;
        float Tcost;
        float window;

        //declare String variables to hold the user's height, width, number of windows and cost inputs:
        String stringHeight;
        String stringWidth;
        String stringwCost;
        String stringtCost;
        String stringWindow;

        //declare other variables:
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        //declare and initialize the Scanner:
        Scanner myScanner = new Scanner(System.in);

        //get input from the user:
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        
        //if(stringHeight == null || stringHeight.isEmpty()) {
        // User hit enter without any data. Display error message then back to top of loop
        //System.out.println("You did not enter the window height");
        //} else { 
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
            
    //}
        
        //if(stringWidth == null || stringWidth.isEmpty()) {
        // User hit enter without any data. Display error message then back to top of loop
        //System.out.println("You did not enter the window width");
        //} else { 
        System.out.println("Please enter the cost of the window:");
        stringwCost = myScanner.nextLine();
        
        //if(stringwCost == null || stringwCost.isEmpty()) {
        // User hit enter without any data. Display error message then back to top of loop
        //System.out.println("You did not enter the cost of the window");
        //} else { 
        System.out.println("Please enter the cost of the trim:");
        stringtCost = myScanner.nextLine();
        
        //if(stringtCost == null || stringtCost.isEmpty()) {
        // User hit enter without any data. Display error message then back to top of loop
        //System.out.println("You did not enter the cost of the trim");
        //} else { 
        System.out.println("Please enter the number of windows required:");
        stringWindow = myScanner.nextLine();
        
        //if(stringWindow == null || stringWindow.isEmpty()) {
        // User hit enter without any data. Display error message then back to top of loop
        //System.out.println("You did not enter the number of windows required");
        //} else { 
        //convert String values of height and width to float values:
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        Wcost = Float.parseFloat(stringwCost);
        Tcost = Float.parseFloat(stringtCost);
        window = Float.parseFloat(stringWindow);

        //calculate the area of the window:
        areaOfWindow = height * width;

        //calculate the perimeter of the window:
        perimeterOfWindow = 2 * (height + width);

        //calculate the total cost - use a hard-coded value for material cost:

        cost = (window * ((Wcost * areaOfWindow) + (Tcost * perimeterOfWindow)));

        //display the results to the user:
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Window amount = " + stringWindow);
        System.out.println("Total Cost =  " + cost);
        
        //}
    
    }
}
