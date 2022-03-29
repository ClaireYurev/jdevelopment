package com.claireyurev;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String shouting = caps("Why did you turn?");
        System.out.println(shouting);

        int[] awesomeArray = displayArrayFromInts(3, 7, 1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);

        System.out.println(PrimitiveOne());
    }

    public static String caps(String s) {
        return s.toUpperCase();
    }

    public static int[] displayArrayFromInts(int a, int b, int c) {

        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        return array;

    }

    public static byte PrimitiveOne() {
        byte little = -128;
        return little;
    }

}
