package com.claireyurev;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        // Declare the variables to hold the base and height

        double base;
        double height;

        System.out.println("Enter the triangle's base: ");
        base = sc.nextDouble();

        System.out.println("Enter the triangle's height: ");
        height = sc.nextDouble();

        double preArea = base * height;

        double Area = preArea / 2;

        System.out.println("The area of your triangle is: " + Area);

    }

}
