package com.claireyurev;

import java.lang.*;
import java.util.*;

class Solution {
    public static List<List<String>> searchSuggestions(String[] repository, String customerQuery) {
        List<List<String>> outputSuggestions2DArray = new ArrayList<>();
        String[] repositoryLowercase = new String[repository.length];
        for (int i = 0; i < repository.length; i++) repositoryLowercase[i] = repository[i].toLowerCase();
        Arrays.sort(repositoryLowercase);
        int left = 0;
        int right = repositoryLowercase.length - 1;

        for (int i = 1; i < customerQuery.length(); i++) {
            List<String> lineOutputArray = new ArrayList<>();
            char c = Character.toLowerCase(customerQuery.charAt(i));
            while (left <= right && (repositoryLowercase[left].length() == i || repositoryLowercase[left].charAt(i) < c)) left++;
            while (left <= right && (repositoryLowercase[right].length() == i || repositoryLowercase[right].charAt(i) > c)) right--;
            for (int j = 0; j < 3 && left + j <= right; j++) lineOutputArray.add(repositoryLowercase[left+j]);
            outputSuggestions2DArray.add(lineOutputArray);
        }
        return outputSuggestions2DArray;
    }
}