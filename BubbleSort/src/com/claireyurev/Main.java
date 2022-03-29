package com.claireyurev;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        printArray(numbers);

        //Sorting algorithm here

        // Set the boolean to TRUE just to ENTER the WHILE LOOP
        // Otherwise you COULD just use a DO WHILE loop, without setting it to true
        boolean elementHasBeenSwapped = true;

        while (elementHasBeenSwapped) {
            // Start OPTIMISTICALLY:
            // Hey, we didn't need to swap anything YET:
            elementHasBeenSwapped = false;
            // Then, if we DO swap anything:
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    // Set the boolean to TRUE
                    elementHasBeenSwapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}