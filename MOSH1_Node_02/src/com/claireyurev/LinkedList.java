package com.claireyurev;
public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            // in this case, add this (var node) AFTER the last Node:
            last.next = node;
            // finally, we should update (last) to point to this new (var node):
            last = node;
        }
    }
}
