package com.claireyurev;

public class Main {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 92;

        fibonacciCache = new long[n + 1]; // because we're counting Fib. numbers from 1, not 0

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n; // if n is 0, it'll ret 0; if n is 1, it'll ret 1;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
