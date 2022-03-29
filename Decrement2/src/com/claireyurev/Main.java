package com.claireyurev;

public class Main {

    public static void main(String[] args) {

        int x = 1;
        int y = x++; // here the order of the prefix matters. First y = 1, then x+1 becomes x=2
        System.out.println(x);
        System.out.println(y);
        // Result: x = 2, y = 1;

        int a = 1;
        int b = ++a; // here the order of the prefix matters. First a+1 becomes a=2, then b=2
        System.out.println(a);
        System.out.println(b);
        // Result: a = 2, b = 2;

    }
}
