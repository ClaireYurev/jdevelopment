package com.claireyurev;

public class Main {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = fruits.length; true; i--)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);

        // Limitations: FORWARD-only iteration,
    }
}
