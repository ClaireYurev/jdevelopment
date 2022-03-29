package com.claireyurev;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

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
