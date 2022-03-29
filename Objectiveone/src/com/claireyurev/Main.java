package com.claireyurev;

public class Main {

    public static void main(String[] args) {

        String x = "Hello";

        objectIntroTest waterBottle = new objectIntroTest(0);
        // Create a new instance of Main class, using the 2nd constructor

        waterBottle.addWater(100);  // Add 100 units of water
        waterBottle.drinkWater(20); // Drink 20 liters of water
        System.out.println("Your remaining water level is: " + waterBottle.getWater());

    }


}
