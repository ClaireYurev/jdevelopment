package com.claireyurev;

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

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public void removeFirst() {
        // Careful: [10 -> 20 -> 30]. We can't just set first to 20, because 10 will still be there
        // and the object (10) won't be picked up by the garbage collector
        // Also: we can't just remove the first link, because we will then lose the ability to get to 20;
        // We solve this via TWO different references. We start with
        // [10 -> 20 -> 30]

        // Declare a variable called "second", and set it to first.next;
        var second = first.next;
        // now that we have this, we can go and remove the 10 -> 20 link, without losing track of the 2nd pt
        first.next = null; // now we have: [10    20 -> 30]
        // finally we need to update (first) and set it to point to the second node (20)
        first =

    }

    public int indexOf(int item) {
        // declare a variable
        int index = 0;
        // then, as we're traversing this list, we increment this variable
        var current = first;

        // as long as we haven't reached the end of the list, so current is NOT null
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        // otherwise
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
