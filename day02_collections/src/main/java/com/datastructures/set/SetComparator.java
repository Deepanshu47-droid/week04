package com.datastructures.set;

import java.util.HashSet;
import java.util.Set;

// Class to compare two sets and check if they are equal
public class SetComparator {

    // Method to check if two sets contain the same elements
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        // Checking if both sets are equal
        return set1.equals(set2);
    }

    // Main method to demonstrate set comparison
    public static void main(String[] args) {
        // Creating two HashSets of integers
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(1);
        set2.add(2);

        // Displaying the sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Checking if the sets are equal
        boolean areEqual = areSetsEqual(set1, set2);
        System.out.println("Are the sets equal? " + areEqual);
    }
}
