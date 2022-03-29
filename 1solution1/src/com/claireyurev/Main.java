package com.claireyurev;

public class Main {

    public static void main(String[] args) {

        int total = 0;
        // first try, with 10

        for(int i = 1; i < 19; ++i){
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
