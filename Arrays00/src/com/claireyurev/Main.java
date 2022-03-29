package com.claireyurev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] numbas = {12, 24, 37};
        System.out.println(numbas);
        System.out.println(Arrays.toString(numbas));
        System.out.println(numbas.length);
    }
}
