package com.datastructures.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Class to find the key with the highest value in a map
public class MaxValueKeyFinder {

    // Method to find the key with the highest value
    public static <K> K findKeyWithMaxValue(Map<K, Integer> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("The map is empty.");
        }

        // Finding the key with the maximum value
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    // Main method to demonstrate finding the key with the highest value
    public static void main(String[] args) {
        // Creating a sample map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Deepanshu", 85);
        scores.put("Raj", 92);
        scores.put("Shubham", 88);
        scores.put("Gagan", 95);

        // Finding the key with the highest value
        String topScorer = findKeyWithMaxValue(scores);

        // Displaying the key with the highest value
        System.out.println("Key with the highest value: " + topScorer);
    }
}
