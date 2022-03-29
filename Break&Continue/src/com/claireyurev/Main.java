package com.claireyurev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("C:/>_");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        //  do {
        //
        //  }
        //  while ();

        // In contrast, do-while loops always get executed at least ONCE,
        // because the condition is checked last, even if the cond. is false

    }
}