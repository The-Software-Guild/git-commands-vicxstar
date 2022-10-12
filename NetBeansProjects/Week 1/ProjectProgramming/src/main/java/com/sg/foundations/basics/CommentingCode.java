package com.sg.foundations.basics;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Basics
 * 
 */
public class CommentingCode {
    
    public static void main(String[] args) {

        //comments are written to explain code in an easily understandable way
        //basically for single lines anything after '//' is considered a comment
        System.out.println("Normal code is compiled and runs ...");
        System.out.println("Comments however ... ");//do not execute!

        //comments can be on their own line:
        System.out.println("..."); //or they can share like this

        //however if you put the '//' BEFORE a line of code
        //System.out.println("Then it is considered a comment");
        System.out.println("and it won't execute!");

        /*     
               This is an example of a multi-line comment, which is useful if
               you want to comment out multiple lines of code quickly.
               Console.WriteLine("Java ignores everything inside the comment markers.");    
        */
    }
    
}
