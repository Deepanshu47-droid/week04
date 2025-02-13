package com.datastructures.map;

import java.util.HashMap;
import java.util.Map;

// Class to count the frequency of each word in a given text
public class WordFrequencyCounter {

    // Method to count the frequency of each word in a given text
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Removing punctuation and converting to lowercase, ensuring no empty strings are processed
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {  // Ignore empty words
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordCountMap;
    }


    // Main method to demonstrate counting word frequency
    public static void main(String[] args) {
        // Sample text input
        String text = "Hello world, hello Java! Welcome to the world of Java programming.";

        // Counting the frequency of each word in the text
        Map<String, Integer> wordFrequency = countWordFrequency(text);

        // Displaying the word frequency map
        System.out.println("Word Frequency: " + wordFrequency);
    }
}
