package com.claireyurev;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {

        List<List<String>> suggestedResults = new ArrayList<>();
        for(int i = 1; i < customerQuery.length(); i++){

            String w = customerQuery.substring(0, i+1).toLowerCase();
            List<String> keywordList = repository.stream()
                    .map(String::toLowerCase)
                    .filter(word -> word.startsWith(w))
                    .sorted()
                    .limit(3)
                    .collect(Collectors.toList());
            suggestedResults.add(keywordList);
        }
        return suggestedResults;
    }

    
    
    
    
}
