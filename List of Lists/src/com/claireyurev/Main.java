package com.claireyurev;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ArrayList<String>> mainList = new ArrayList<ArrayList<String>>();
        rom di prisco
        ArrayList<String> subList1 = new ArrayList<String>();
        subList1.add("A");
        subList1.add("B");

        mainList.add(subList1);

        ArrayList<String> subList2 = new ArrayList<String>();

        subList2.add("C");
        subList2.add("D");
        mainList.add(subList2);

        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j < mainList.get(i).size(); j++) {
                System.out.print(mainList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // Using for each
        System.out.println("Using for-each");
        mainList.forEach((list)  -> {list.forEach((alphabet)->System.out.println(alphabet)); });
    }
}