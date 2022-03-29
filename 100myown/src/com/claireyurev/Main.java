package com.claireyurev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int [] arrayOfInts = new int [] { 1, 2, 3, 4 };

        for( int i : arrayOfInts )
            System.out.println(i);

        List<String> list = new ArrayList<>();
        list.add("added1");
        list.add("added two");

        for( String s : list)
            System.out.println(s);

    }
}
