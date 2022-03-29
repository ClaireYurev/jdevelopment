package com.claireyurev;
/*
*   ProjectEuler.net
*   Problem 1: Multiples of 3 or 5
*   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
*   The sum of these multiples is 23.
*
*   Task: Find the sum of all the multiples of 3 or 5 below 1000.
* */

public class Main {

    public static void main(String[] args) {

        int total = 0;
        // first try, with 10

        for(int i = 1; i < 1000; ++i){
            System.out.println("BEGIN FOR Statement, attempt: " + i);
            if(i%3 == 0 || i%5 == 0) {
                System.out.println("    Begin IF Statement, attempt: " + i);
                total += i;
                System.out.println("        IF Statement Has Executed, Total is: " + total);
                System.out.println("    End IF Statement, attempt: " + i);
            }
            System.out.println("END FOR Statement, attempt: " + i);

        }

    }
}
