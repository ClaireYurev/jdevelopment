package com.claireyurev;

import java.util.*;
import java.lang.*;

class Solution {
    public List<List<String>> suggestedProducts(String[] inputKeywordsArray, String customerQueryString) {
        Arrays.sort(inputKeywordsArray);
        List<List<String>> outputSuggestions2DArray = new ArrayList<>();
        int left = 0, right = inputKeywordsArray.length - 1;
        for (int i = 0; i < customerQueryString.length(); i++) {
            List<String> lineOutputArray = new ArrayList<>();
            char c = customerQueryString.charAt(i);
            while (left <= right && (inputKeywordsArray[left].length() == i || inputKeywordsArray[left].charAt(i) < c)) left++;
            while (left <= right && (inputKeywordsArray[right].length() == i || inputKeywordsArray[right].charAt(i) > c)) right--;
            for (int j = 0; j < 3 && left + j <= right; j++)
                lineOutputArray.add(inputKeywordsArray[left+j]);
            outputSuggestions2DArray.add(lineOutputArray);
        }
        return outputSuggestions2DArray;
    }
}