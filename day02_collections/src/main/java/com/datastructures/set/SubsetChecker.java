package com.datastructures.set;

import java.util.HashSet;
import java.util.Set;

// Class to check if one set is a subset of another
public class SubsetChecker {

    // Method to check if set1 is a subset of set2
    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        // Checking if set2 contains all elements of set1
        return set2.containsAll(set1);
    }

    // Main method to demonstrate subset checking
    public static void main(String[] args) {
        // Creating the first HashSet of integers (set1)
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        // Creating the second HashSet of integers (set2)
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Displaying the sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Checking if set1 is a subset of set2
        boolean result = isSubset(set1, set2);
        System.out.println("Is Set 1 a subset of Set 2? " + result);
    }
}
