package com.claireyurev;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

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
                    swap(numbers, i, i + 1);
                }
            }
        }

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}