package com.claireyurev;

/*
*
*   THIS CLASS IS TESTING ONLY: to test the algo within "Solution" class.
*
*   (It provides the TWO INPUTS for the "Solution" class)
*
*
* */

import java.util.*;

@SuppressWarnings("GrazieInspection")
public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("added1");
        list.add("added two");

        for( String s : list)
            System.out.println(s);

        // We declare the first INPUT, named "inputRepository", to be used as the argument
        // that's going to get passed into the suggestedProducts method of Solution class,
        // per the (question-defined) "String[] P" parameter of suggestedProducts method.

        String[] inputRepository = new String[] {"mobile", "mouse", "moneypot", "monitor"};

        // Now we declare the second INPUT, named "inputCustomerQuery", to be used as the argument
        // that's going to get passed into the suggestedProducts method of Solution class,
        // per the (question-defined) "String S" parameter of suggestedProducts method.

        String inputCustomerQuery = "mouse";

        // Now we instantiate the Solution class
        Solution outputGenerator = new Solution();

        // And call the suggestedProducts method of the Solution class instance,
        // accessing the two inputs we have already declared above and passing them in

        List<String> ArrayList1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        List<List<String>> myList = new ArrayList<List<String>>();

        List<List<String>> twoDeeArray = new outputGenerator.suggestedProducts( inputRepository, inputCustomerQuery );

    }
}
