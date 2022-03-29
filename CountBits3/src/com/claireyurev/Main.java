package com.claireyurev;

public class Main {

    public static void main(String[] args) {

        int a = 8;      // 1 0 0 0
                        // 1 0 0 0.         Imagine an imaginary dot
                        // 1 0 0 0 0 0.     The number will "move" to the left, growing by 2 zeros.
        int b = a << 2; // 1 0 0 0 0 0      This should be 32
                        //                  << LEFT shift appends two zeroes to the end of the number
        System.out.println(b);

        int c = 8;      // 1 0 0 0
                        // 1 0 0 0.     Imagine an imaginary dot again
                        // 1 0 .        It will "squeeze" the number into the 'cutoff' imaginary dot
        int d = c >> 2; // 1 0          This should be 2
                        //              >> RIGHT shift drops two positions at the right end of the number.
        System.out.println(d);
    }
}
