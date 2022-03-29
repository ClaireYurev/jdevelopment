package com.claireyurev;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        count++;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        count++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while(current != null) {
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var previous = getPrevious(last);

        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node givenNode) {
        var secondLast = first;
        while (secondLast != null) {  // itself, as opposed to itself.next
            if (secondLast.next == givenNode) return secondLast;
            secondLast = secondLast.next;
        }
        return null;
    }

    public boolean contains(int item) {
        return (indexOf(item)!=-1);
    }

    public int size() {
        return count; // O(1)
    }

    private boolean isEmpty() {
        return first == null;
    }

}