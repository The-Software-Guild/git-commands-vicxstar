package com.sg.foundations.variables.basicprogrammingconcepts;

import java.util.Arrays;


/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 18/10/2022
 * purpose: Summative Sums
 * 
 */
public class SummativeSums {
    
    public static void main(String[] args) {
        
        //create a one dimensional arrays and give them values:
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        
        //use the 'array' module to add up the values and decalre a variable to hold their values:
        int sum1 = Arrays.stream(array1).sum();
        int sum2 = Arrays.stream(array2).sum();
        int sum3 = Arrays.stream(array3).sum();
        
        //print out the sums:
        System.out.println("#1 Array Sum: " + sum1);
        System.out.println("#2 Array Sum: " + sum2);
        System.out.println("#3 Array Sum: " + sum3);
        
        
    }
    
}
