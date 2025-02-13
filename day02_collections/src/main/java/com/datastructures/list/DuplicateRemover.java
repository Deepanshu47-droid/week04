package com.datastructures.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Class to remove duplicate elements from a list while preserving order
public class DuplicateRemover {

    // Method to remove duplicates from a list
    public static <T> List<T> removeDuplicates(List<T> list) {
        List<T> resultList = new ArrayList<>();
        Set<T> seenElements = new HashSet<>();

        // Iterating through the list and adding elements to the result if not seen before
        for (T element : list) {
            if (seenElements.add(element)) {
                resultList.add(element);
            }
        }

        return resultList;
    }

    // Main method to demonstrate removing duplicates from a list
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Displaying the original list
        System.out.println("Original List: " + numbers);

        // Removing duplicates while preserving order
        List<Integer> resultList = removeDuplicates(numbers);

        // Displaying the list after removing duplicates
        System.out.println("List after removing duplicates: " + resultList);
    }
}
