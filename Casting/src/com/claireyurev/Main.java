package com.claireyurev;

public class Main {

    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        //System.out.println(y);

        double a = 1.1;
        double b = a + 2; // 2.0
        //System.out.println(b);

        double e = 1.1;
        int r = (int)e + 2; // EXPLICIT casting
        System.out.println(r);

    }
}
