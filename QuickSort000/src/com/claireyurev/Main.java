package com.claireyurev;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter: ");
        System.out.println(Arrays.toString(numbers));
    }

        private static void quicksort(int[] array, int lowIndex, int highIndex) {
            // deal with the case where it's just 1 number in the array
            if (lowIndex >= highIndex) {
                return;
            }

            // choose a pivot
            int pivot =  array[highIndex];

            // partitioning: lp and rp
            int leftPointer = lowIndex;
            int rightPointer = highIndex;

            while (leftPointer < rightPointer) {

                while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                    leftPointer++;
                }

                while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                    rightPointer--;
                }

                swap(array, leftPointer, rightPointer);

                quicksort(array, lowIndex, leftPointer - 1);
                quicksort(array, leftPointer + 1, highIndex);

            }

        }

        private static void swap(int[] array, int index1, int index2) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

}
