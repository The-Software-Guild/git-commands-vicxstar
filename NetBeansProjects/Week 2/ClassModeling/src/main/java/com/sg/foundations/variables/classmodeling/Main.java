package com.sg.foundations.variables.classmodeling;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 19/10/2022
 * purpose: House class - Main
 * 
 */

//create a main class to call the class 'House' into:
public class Main {
    
    public static void main(String[] args) {
        
        //declare a new instace of the 'house' class called 'myHouse':
        House myHouse = new House("Brook House", 15, "Bredgar Street", "Lewisham", "London", "SE13 6QN");
        
        //print out the method that was defined in the 'House' class:
        System.out.println(myHouse.address());
        
        
        //declare a new instace of the 'Car' class called 'myCar':
        Car myCar = new Car("Hatchback", "Red", "Citereon", 0123456, 5, 4);
        
        //print out the method that was defined in the 'House' class:
        System.out.println(myCar.carInfo());
    }
    
}
