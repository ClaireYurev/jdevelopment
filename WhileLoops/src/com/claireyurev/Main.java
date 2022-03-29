package com.claireyurev;

public class Main {

    public static void main(String[] args) {

        // Use a FOR loop when you know EXACTLY how many times you want to execute
        // one or more statements
        for (int i = 5; i > 0; i--)
            System.out.println("For: Hello World " + i);

        int i = 5;
        while(i > 0) {
            System.out.println("While: Hello World " + i);
            i--;
        }
    }
}
