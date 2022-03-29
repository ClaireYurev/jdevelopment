package com.claireyurev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        // 3 vs 5 vs 15 implementation
        // in situations like this, you need to have the most specific conditions
        // on the top, and the least specific conditions on the bottom

        if (number % 5 == 0 && number %3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 3 == 0)
            System.out.println("Fizz");
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
