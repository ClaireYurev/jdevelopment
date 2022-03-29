package com.claireyurev;

public class Array {

    private int[] items;
    // Declare another private field to keep track of inserted items
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if the array is full, we need to resize it
        if (items.length == count){
            // Create a new array (twice the size)
            int[] newItems = new int[count*2];
            // Copy all items into new array
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // Set "items" field to this new array
            items = newItems;
        }


        // Also, add the new item at the end of the current array
        // items[count] = item;
        // count++;
        items[count++] = item;
    }

    public void print() {
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
