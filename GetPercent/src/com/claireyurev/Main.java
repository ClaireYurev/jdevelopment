package com.claireyurev;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        // Formatting values
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.14654354);
        System.out.println(result);

        // Formatting values = ANOTHER WAY (shorthand if no references exist)
        // Method Chaining = we're chaining multiple methods together
        String resultnew = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultnew);


    }
}
