package com.claireyurev;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.removeAt(3);
        numbers.print();
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(100));

    }
}
