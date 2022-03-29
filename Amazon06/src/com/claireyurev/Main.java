package com.claireyurev;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //String[] inputRepository;
        //inputRepository = new String [] {"mobIle", "moUse", "moNeypot", "mOniTor", "moUsePad"};

        // ArrayList<String> inputRepository = new ArrayList<String>();
        // inputRepository.add("moBilE");
        // inputRepository.add("moUse");
        // inputRepository.add("moNeypot");
        // inputRepository.add("mOniTor");
        // inputRepository.add("moUsePad");

        List<String> inputRepository = new ArrayList<>(
                List.of("moBilE",
                        "moUse",
                        "moNeypot",
                        "mOniTor",
                        "moUsePad"));

        String inputCustomerQuery = "MouSe";
        List<List<String>> providedSuggestions = new Result().searchSuggestions(inputRepository, inputCustomerQuery);
        System.out.println(providedSuggestions);
    }
}
