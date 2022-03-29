package com.claireyurev;

import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

class Result {
    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        List<List<String>> outputSuggestions2DArray = new ArrayList<>();
        List<String> repositoryLowercase = repository.stream().map(String::toLowerCase).collect(Collectors.toList());
        Collections.sort(repositoryLowercase);
        int left = 0;
        int right = repositoryLowercase.size() - 1;
        for (int i = 1; i < customerQuery.length(); i++) {
            List<String> lineOutputArray = new ArrayList<>();
            char c = Character.toLowerCase(customerQuery.charAt(i));
            while (left <= right && (repositoryLowercase.get(left).length() == i || repositoryLowercase.get(left).charAt(i) < c)) left++;
            while (left <= right && (repositoryLowercase.get(right).length() == i || repositoryLowercase.get(right).charAt(i) > c)) right--;
            for (int j = 0; j < 3 && left + j <= right; j++) lineOutputArray.add(repositoryLowercase.get(left+j));
            outputSuggestions2DArray.add(lineOutputArray);
        }
        return outputSuggestions2DArray;
    }
}