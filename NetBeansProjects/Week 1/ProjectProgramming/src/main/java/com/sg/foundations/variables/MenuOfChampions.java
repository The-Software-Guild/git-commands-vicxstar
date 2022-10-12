package com.sg.foundations.variables;


/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 12/10/2022
 * purpose: Variables
 * 
 */
public class MenuOfChampions {
    
    public static void main(String[] args) {
        //declare all the variables:
        String intro, food, drink, dessert, sign, menuF, menuDr, menuDe; 
        String fPrice, drPrice, dePrice;
        
        intro = "          Welcome to the resturant HASH SHA-1        ";
        food = "Lasagna";
        drink = "Pepsi";
        dessert = "Chocolate Brownie";
        sign = "£";
        fPrice = "23.00";
        drPrice = "5.50";
        dePrice = "15.00";
        
        menuF = "    Food        -               " + food + "         ****     " + sign + fPrice;
        menuDr = "    Drink       -                " + drink + "          ****     " + sign + drPrice;
        menuDe = "    Dessert     -         " + dessert + "     ****     " + sign + dePrice;
        
        System.out.println();
        System.out.println("       " + intro);
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println(menuF);
        System.out.println();
        System.out.println(menuDr);
        System.out.println();
        System.out.println(menuDe);
        System.out.println();
        
    }
}
