package com.claireyurev;

import java.util.*;
import java.util.Arrays;
import java.lang.*;

class Solution {
    public static List<List<String>> searchSuggestions(List(String) inputKeywordsArray, String customerQueryString) {

        // Create the RETURN object
        List<List<String>> outputSuggestions2DArray = new ArrayList<>();

        // Convert the given input array into lowercase and sort it
        String[] inputKeywordsLowercaseArray = new String[inputKeywordsArray.length];
        for (int i = 0; i < inputKeywordsArray.length; i++) inputKeywordsLowercaseArray[i] = inputKeywordsArray[i].toLowerCase();
        Arrays.sort(inputKeywordsLowercaseArray);

        int left = 0;
        int right = inputKeywordsLowercaseArray.length - 1;

        // i = 1 (NOT i = 0) below: ONLY return keyword suggestions after the first TWO characters
        for (int i = 1; i < customerQueryString.length(); i++) {

            List<String> lineOutputArray = new ArrayList<>();
            char c = Character.toLowerCase(customerQueryString.charAt(i));
            while (left <= right && (inputKeywordsLowercaseArray[left].length() == i || inputKeywordsLowercaseArray[left].charAt(i) < c)) {
                // Increment the LEFT variable
                left++;
            }
            while (left <= right && (inputKeywordsLowercaseArray[right].length() == i || inputKeywordsLowercaseArray[right].charAt(i) > c)) {
                // Decrement the RIGHT variable
                right--;
            }
            for (int j = 0; j < 3 && left + j <= right; j++) {
                lineOutputArray.add(inputKeywordsLowercaseArray[left+j]);
            }
            outputSuggestions2DArray.add(lineOutputArray);
        }
        return outputSuggestions2DArray;
    }
}