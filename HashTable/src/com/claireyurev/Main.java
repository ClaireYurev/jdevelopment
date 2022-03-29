package com.claireyurev;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap empIds = new HashMap();
        empIds.put(1, "Claire");
        empIds.put(2, "Chloe");
        empIds.put(3, "Jasmin");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Claire");
        map.put(2, "Chloe");
        map.put(3, "Jasmin");

        System.out.println(map);
        System.out.println(empIds);
    }
}
