package com.claireyurev;

public class Main {

    public static void main(String[] args) {

        // Let's instantiate a new object
        DynamicArray numbers = new DynamicArray(3);
        numbers.insert(11);
        numbers.insert(22);
        numbers.insert(33);
        numbers.insert(44);
        //numbers.removeAt(2);
        //numbers.removeAt(2);
        numbers.print();
        System.out.println(numbers.indexOf(44));

    }
}
