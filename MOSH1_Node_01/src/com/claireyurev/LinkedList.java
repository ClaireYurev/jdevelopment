package com.claireyurev;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        // Now our Node object is ALWAYS in a valid state

    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        // 1st: Wrap this value (the integer) inside a Node object.
        // Node nodeDelete = new Node(); // Unnecessary
        var node = new Node(item); // let compiler infer
        // new.value = item; // we cannot access a private field!
    }
}
