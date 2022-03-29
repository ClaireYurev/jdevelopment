package com.claireyurev;

public class Array {

    private int[] items;
    // Declare another private field to keep track of inserted items
    private int count;

    public Array(int length) {
        items = new int[length];
    }
    public void print() {
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
