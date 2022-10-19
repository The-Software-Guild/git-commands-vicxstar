package com.sg.foundations.variables.classmodeling;

/**
 *
 * @author vic
 * email: vickiayoade@gmail.com
 * date: 18/10/2022
 * purpose: House class
 * 
 */
public class House {
    
    //define properties:
    private String houseName;
    private int doorNum;
    private String streetName;
    private String town;
    private String country;
    private String postCode;
    
    //implement 'getters' and 'setters':
    //for houseName:
    public String getHouseName() {
        return houseName;
    }
    
    public void setHouseName(String newHouseName) {
        this.houseName = newHouseName;
    }
    
    //for doorNum:
    public int getDoorName() {
        return doorNum;
    }
    
    public void setDoorNum(int newDoorNum) {
        this.doorNum = newDoorNum;
    }
    
    //for streetName:
    public String getStreetName() {
        return streetName;
    }
    
    public void setStreetName(String newStreetName) {
        this.streetName = newStreetName;
    }
    
    //for town:
    public String getTown() {
        return town;
    }
    
    public void setTown(String newTown) {
        this.town = newTown;
    }
    
    //for country:
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String newCountry) {
        this.country = newCountry;
    }
    
    //for postCode:
    public String getPostCode() {
        return postCode;
    }
    
    public void setPostCode(String newPostCode) {
        this.postCode = newPostCode;
    }
    
    //implement a constructor to initialise values:
    public House(String houseName, int doorNum, String streetName, String town, String country, String postCode) {
        this.houseName = houseName;
        this.doorNum = doorNum;
        this.streetName = streetName;
        this.town = town;
        this.country = country;
        this.postCode = postCode;
    }
    
    //determine what behaviors the class should have and define the methods associated with each behavior:
    //method to print out address:
    public String address() {
        return new String("Your address is: " + houseName + ", "  + doorNum + " " + streetName + ", " + town  + ", " + country + ", " + postCode);
    }
    
}