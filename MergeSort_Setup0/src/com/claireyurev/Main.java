package com.claireyurev;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1_000_000);
        }

        System.out.println("Before:");
        printArray(numbers);

        // Algos go BRRRRR

        mergeSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {

    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}