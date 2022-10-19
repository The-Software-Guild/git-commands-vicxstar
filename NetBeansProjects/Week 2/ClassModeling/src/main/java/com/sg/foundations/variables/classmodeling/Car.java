package com.sg.foundations.variables.classmodeling;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 18/10/2022
 * purpose: Car class
 * 
 */
public class Car {
    
    //define properties:
    private String type;
    private String colour;
    private String make;
    private int modelNum;
    private int noOfDoors;
    private int noOfWheels;
    
    //implement 'getters' and 'setters':
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getColour() {return colour;}
    public void setColour(String colour) {this.colour = colour;}
    public String getmake() {return make;}
    public void setMake(String make) {this.make = make;}
    public int getModelNum() {return modelNum;}
    public void setModelNum(int modelNum) {this.modelNum = modelNum;}
    public int getNoOfDoors() {return noOfDoors;}
    public void setNoOfDoors(int noOfDoors) {this.noOfDoors = noOfDoors;}
    public int getNoOfWheels() {return noOfWheels;}
    public void setNoOfWheels(int noOfWheels) {this.noOfWheels = noOfWheels;}
    
    //implement a constructor to initialise values:
    public Car(String type, String colour, String make, int modelNum, int noOfDoors, int noOfWheels) {
        this.type = type;
        this.colour = colour;
        this.make = make;
        this.modelNum = modelNum;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
    }
    
    //determine what behaviors the class should have and define the methods associated with each behavior:
    //method to print out car info:
    public String carInfo() {
        return new String("The details of your car are: it is a: " + colour + " " + type + "; It is a : " + make + "; the model Number is: " + modelNum + "; It has " + noOfDoors + " doors, and " + noOfWheels + " wheels");
    }
}
