package com.claireyurev;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        // int[] numbers = new int[1_000_000_000];
        // Causes java.lang.OutOfMemoryError: Java heap space
        int[] numbers = new int[100_000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1_000_000);
        }

        System.out.println("Before:");
        //printArray(numbers);

        // Algos go BRRRRR

        splitInTwo(numbers);

        System.out.println("\nAfter:");
        //printArray(numbers);
    }

    private static void splitInTwo(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2)
            return;

        // int midIndex = inputLength / 2;
        int lengthLeftHalf = inputLength / 2; // Exactly half of whatever the size is
        int lengthRightHalf = inputLength - lengthLeftHalf; // Exactly EVEN or ODD - works all the time
        int[] leftHalf = new int[lengthLeftHalf];
        // int[] rightHalf = new int[inputLength - midIndex];
        int[] rightHalf = new int[lengthRightHalf];

        for (int i = 0; i < lengthLeftHalf; i++) {
            // can use i BELOW because we're starting at zero:
            leftHalf[i] = inputArray[i];
        }

        for (int i = lengthLeftHalf; i < inputLength; i++) {
            // can't use i BELOW because we want to start at 0:
            rightHalf[i - lengthLeftHalf] = inputArray[i];
        }

        // Recursion comes in here:

        splitInTwo(leftHalf);
        splitInTwo(rightHalf);

        // Merge

        merge(inputArray, leftHalf, rightHalf);

    }

    private static void merge (int[] outputArray, int[] leftHalfResult, int[] rightHalfResult) {
        int lengthSubLeftHalf = leftHalfResult.length;
        int lengthSubRightHalf = rightHalfResult.length;

        int i = 0; // Iterator for the left half
        int j = 0; // Iterator for the right half
        int k = 0; // Iterator for the merged array

        while (i < lengthSubLeftHalf && j < lengthSubRightHalf) {
            if (leftHalfResult[i] <= rightHalfResult[j]) {
                outputArray[k] = leftHalfResult[i];
                i++;
            }
            else {
                outputArray[k] = rightHalfResult[j];
                j++;
            }
            k++;
        }

        // To account for any possible elements left over in the LEFT array:
        while (i < lengthSubLeftHalf) {
            outputArray[k] = leftHalfResult[i];
            i++;
            k++;
        }

        // To account for any possible elements left over in the RIGHT array:
        while (j < lengthSubRightHalf) {
            outputArray[k] = rightHalfResult[j];
            j++;
            k++;
        }

    }


    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}