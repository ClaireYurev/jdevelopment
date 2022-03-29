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
        // that's going to get passed into the searchSuggestions method of Solution class,
        // per the (question-defined) "String[] P" parameter of searchSuggestions method.

        // The below works in an elegant one-liner
        // String[] inputRepository = new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"};

        // Fundamental: first, we declare an Array of Strings, and call it inputRepository:
        String[] inputRepository;
        // The new operator creates an instance of the array
        inputRepository = new String [] {"mobIle", "moUse", "moNeypot", "mOniTor", "moUsePad"};

        // Now we declare the second INPUT, named "inputCustomerQuery", to be used as the argument
        // that's going to get passed into the searchSuggestions method of Solution class,
        // per the (question-defined) "String S" parameter of searchSuggestions method.

        String inputCustomerQuery = "MouSe";

        // Now we instantiate the Solution class
        // Solution outputGenerator = new Solution();

        // And call the searchSuggestions method of the Solution class instance,
        // accessing the two inputs we have already declared above and passing them in

        // Object creation is a type of EXPRESSION and the Result is an object REFERENCE.
        // You can create a new object and invoke a method in it WITHOUT ASSIGNING the
        // object to a Reference TYPE VARIABLE ->> !!! IF YOU HAVE SOME REASON TO... !!!

        // Declaring and Instantiating in 1 line. We don't even need to know, that the
        // returned result of this new Solution()... class is of the ArrayList<>() kind.
        List<List<String>> providedSuggestions = new Solution().searchSuggestions(inputRepository, inputCustomerQuery);

        System.out.println(providedSuggestions);
    }
}
