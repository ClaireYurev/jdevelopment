package com.claireyurev;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        //inputTest();
        //countNumber();
        compareUnequalString();
    }

    public static void inputTest(){
        String message = input.nextLine();
        System.out.println(Hello(message));
    }

    public static String Hello(String message) {
        if (message.equals("Hi")) {
            return "Hello";
        } else {
            return "Goodbye";
        }
    }

    public static void countNumber() {
        int i = 0;
        // Make our program count to 100
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public static void compareUnequalString() {
        String x = "Brandon";
        String y = "Ryan";
        if (!x.equals(y)){
            System.out.println("X does not equal y.");
            if (2 != 5) {
                System.out.println("2 does not equal 5.");
            }
        }
    }

}
