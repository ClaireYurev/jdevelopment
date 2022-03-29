package com.claireyurev;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public int indexOf(int value) {
        // Find & return the item INDEX, if it exists
        for (int i = 0; i < count; i++)
            if (items[i] == value)
                return i;
        // Return some arbitrary value if it doesn't exist
        return -1;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for(int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public void insert(int item) {
        if(items.length == count) {
            int[] newItems = new int[items.length*2];
            for(int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
