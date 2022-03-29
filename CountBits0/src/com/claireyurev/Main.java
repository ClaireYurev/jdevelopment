package com.claireyurev;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        int a = -1;
        int b = a >> 1;
        int c = a >>> 1;

        System.out.println("a = " + a + "\t\t<=> " + Integer.toBinaryString(a));
        System.out.println("b = " + b + "\t\t<=> " + Integer.toBinaryString(b));
        System.out.println("c = " + c + "\t<=> " + Integer.toBinaryString(c));
    }
}
