package com.claireyurev;
/*
 *
 *   THIS CLASS IS TESTING ONLY: to test the algo within "Solution" class.
 *
 *   (It provides the TWO INPUTS for the "Solution" class)
 *
 * */
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        // We declare the first INPUT, named "inputRepository", to be used as the argument
        // that's going to get passed into the suggestedProducts method of Solution class,
        // per the (question-defined) "String[] P" parameter of suggestedProducts method.

        String[] inputRepository = new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"};

        // Now we declare the second INPUT, named "inputCustomerQuery", to be used as the argument
        // that's going to get passed into the suggestedProducts method of Solution class,
        // per the (question-defined) "String S" parameter of suggestedProducts method.

        String inputCustomerQuery = "mouse";

        // Now we instantiate the Solution class
        // Solution outputGenerator = new Solution();

        // And call the suggestedProducts method of the Solution class instance,
        // accessing the two inputs we have already declared above and passing them in

        // Object creation is a type of EXPRESSION and the Result is an object REFERENCE.
        // You can create a new object and invoke a method in it WITHOUT ASSIGNING the
        // object to a Reference TYPE VARIABLE ->> !!! IF YOU HAVE SOME REASON TO... !!!

        List<List<String>> providedSuggestions = new Solution().suggestedProducts(inputRepository, inputCustomerQuery);
        System.out.println(providedSuggestions);
    }
}
