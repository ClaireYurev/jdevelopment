package com.claireyurev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printAMessage();
        int d=3;
        int g=7;
        int sum = add(g, d);
        System.out.println(sum);
    }

    public static void printAMessage() {
        System.out.println("This is our 1st method");
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
