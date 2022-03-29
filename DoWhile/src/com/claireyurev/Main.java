package com.claireyurev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        // With while loops, we check the condition first,
        // if the condition is false the first time, the
        // loop will never get executed.
        while (!input.equals("quit")) {
            System.out.println("C:/>_");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        do {
            System.out.println("C:/>_");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        // In contrast, do-while loops always get executed at least ONCE,
        // because the condition is checked last, even if the cond. is false

    }
}