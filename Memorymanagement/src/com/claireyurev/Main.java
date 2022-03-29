package com.claireyurev;

public class Main {

    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        System.out.println(x);
        System.out.println(y);
        x = 2;
        System.out.println("Reassigned x, 2 instead of 1 now:");
        System.out.println(x);
        System.out.println(y);
        // X and Y are INDEPENDENT of each other
    }
}
