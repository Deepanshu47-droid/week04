package com.datastructures.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

// Class to convert a HashSet of integers into a sorted list
public class SetToSortedListConverter {

    // Method to convert a set of integers into a sorted list
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Creating a new list from the set
        List<Integer> sortedList = new ArrayList<>(set);
        // Sorting the list in ascending order
        Collections.sort(sortedList);
        return sortedList;
    }

    // Main method to demonstrate converting a set to a sorted list
    public static void main(String[] args) {
        // Creating a HashSet of integers
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        // Displaying the original set
        System.out.println("Original Set: " + numbers);

        // Converting the set to a sorted list
        List<Integer> sortedList = convertToSortedList(numbers);

        // Displaying the sorted list
        System.out.println("Sorted List: " + sortedList);
    }
}
