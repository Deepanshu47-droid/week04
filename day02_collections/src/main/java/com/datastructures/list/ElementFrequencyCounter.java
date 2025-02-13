package com.datastructures.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// Class to count the frequency of elements in a list
public class ElementFrequencyCounter {

    // Method to count the frequency of elements in a given list
    public static <T> Map<T, Integer> countFrequency(List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();

        // Iterating through the list to count occurrences
        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }

    // Main method to demonstrate counting the frequency of elements in a list
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");

        // Counting the frequency of each element in the list
        Map<String, Integer> frequency = countFrequency(fruits);

        // Displaying the frequency of each element
        System.out.println("Frequency of elements: " + frequency);
    }
}
