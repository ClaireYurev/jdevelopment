package com.claireyurev;

public class Main {

    public static void main(String[] args) {
	    int n = 50;

        System.out.println(fibonacci(n));

    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n; // if n is 0, it'll ret 0; if n is 1, it'll ret 1;
        }

        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
