package com.claireyurev;

public class objectIntroTest {

    int tWater = 0; // This is how much water there is in the water bottle

    // Make a constructor
    public objectIntroTest() {
        // Constructor for when you pass in a parameter
        tWater = 0;
    }

    public objectIntroTest(int waterAmount) {
        // Constructor for when you pass in a parameter
        tWater = waterAmount;
    }

    public void addWater(int amount) {
        tWater = tWater + amount;
        //tWater += amount;
    }

    public void drinkWater(int amount) {
        tWater = tWater - amount;
        //tWater -= amount;
    }

    public int getWater() {
        return tWater;
    }

}
