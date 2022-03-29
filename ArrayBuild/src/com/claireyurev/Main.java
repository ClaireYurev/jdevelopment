package com.claireyurev;

public class Main {

    public static void main(String[] args) {
        Array numbaz = new Array(3);
        numbaz.insert(10);
        numbaz.insert(20);
        numbaz.insert(30);
        numbaz.insert(40);
        numbaz.removeAt(4);
        numbaz.print();
    }
}