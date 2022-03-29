package com.claireyurev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // while (input != "quit");
        // ^ WRONG, because the = operator compares memory addresses
        // quit and quit will not equal to each other
        // So you must use .equals instead

        while (!input.equals("quit")) {
            System.out.println("C:/>_");
            input = scanner.next().toLowerCase();
            System.out.println(input);
            // In this implementation, we were gonna create a new Scanner object
            // each time the user enters something. That's not good!
            // Unnecessary and bad practice: this pollutes our memory.
            // CREATE OBJECTS OUTSIDE OF WHILE LOOPS :)
        }
    }
}