package com.claireyurev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id) {}

    public void addEdge(int source, int destination) {}

    public boolean hasPathDFS(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(s, d, visited);
    }


}
