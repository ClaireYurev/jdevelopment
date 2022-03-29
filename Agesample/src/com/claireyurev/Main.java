package com.claireyurev;
/*
Primitive types demo
 */


public class Main {

    public static void main(String[] args) {
        int age = 30;
        // ^ You don't need 4 bytes of memory to store age. Use a byte

        byte age2 = 30;

        int subscribersCount = 2_123_456_789;
        int subscribersCount2 = 3_123_456_789;  // Too much, 2 Billion is the max for INT

        long followersCount = 3_123_456_789;  // Number is good, but Java sees it as INT, so you need to denote with L:
        long viewsCount = 3_123_456_789L;

        double price1 = 10.99; // You don't need a double to store price of a product. Change to float:

        float price = 10.99F; // Java still thinks this a double. Denote with an f

        char letter = 'A';

        boolean isEligible = true;

        System.out.println(viewsCount);
    }
}
