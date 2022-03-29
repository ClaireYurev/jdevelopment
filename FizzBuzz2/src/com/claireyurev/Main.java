package com.claireyurev;

import java.util.Scanner;

public class Main {

    // D.R.Y. = Don't repeat yourself
    // Programming and problem solving is all about trade-offs
    // Every solution has certain strengths and certain weaknesses

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        // 3 vs 5 vs 15 implementation v.2
        // This is a bad practice
        // Increases Big O time as well

        if (number % 5 == 0) {
            if (number % 3 ==0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 3 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
    }
}
