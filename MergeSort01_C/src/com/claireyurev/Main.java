package com.claireyurev;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[100_000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1_000_000);
        }
        System.out.println("Before:");
        printArray(numbers);
        splitInTwo(numbers);
        System.out.println("\nAfter:");
        printArray(numbers);
    }
    private static void splitInTwo(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) return;

        int lengthLeftHalf = inputLength / 2;
        int lengthRightHalf = inputLength - lengthLeftHalf;
        int[] leftHalf = new int[lengthLeftHalf];
        int[] rightHalf = new int[lengthRightHalf];

        for (int i = 0; i < lengthLeftHalf; i++)
            leftHalf[i] = inputArray[i];

        for (int i = lengthLeftHalf; i < inputLength; i++)
            rightHalf[i - lengthLeftHalf] = inputArray[i];

        splitInTwo(leftHalf);
        splitInTwo(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }
    private static void merge (int[] outputArray, int[] leftHalfResult, int[] rightHalfResult) {
        int lengthSubLeftHalf = leftHalfResult.length;
        int lengthSubRightHalf = rightHalfResult.length;
        int i = 0, j = 0, k = 0;
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
        while (i < lengthSubLeftHalf) {
            outputArray[k] = leftHalfResult[i];
            i++;
            k++;
        }
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