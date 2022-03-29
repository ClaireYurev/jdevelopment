package com.claireyurev;

public class DynamicArray {

    private int[] items;
    private int count;

    public DynamicArray(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count*2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

     public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    // indexOf
    public int indexOf(int value) {
        // If the item exists, we return its location
        for (int i = 0; i < count; i++) {
            if (items[i] == value)
                return i;
        }
        // Otherwise, let's return -1
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}
