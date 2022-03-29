package com.claireyurev;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        int result0 = (int) Math.round(Math.random() * 100);
        System.out.println(result0);

        // Formatting values
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);


    }
}
