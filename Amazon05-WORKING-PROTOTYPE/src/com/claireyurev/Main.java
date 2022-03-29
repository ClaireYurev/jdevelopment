package com.claireyurev;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] inputRepository;
        inputRepository = new String [] {"mobIle", "moUse", "moNeypot", "mOniTor", "moUsePad"};
        String inputCustomerQuery = "MouSe";
        List<List<String>> providedSuggestions = new Solution().searchSuggestions(inputRepository, inputCustomerQuery);
        System.out.println(providedSuggestions);
    }
}
