package com.datastructures.set;

import java.util.HashSet;
import java.util.Set;

// Class to compute the symmetric difference of two sets
public class SymmetricDifferenceFinder {

    // Method to compute the symmetric difference between two sets
    public static <T> Set<T> computeSymmetricDifference(Set<T> set1, Set<T> set2) {
        // Creating a new set for the symmetric difference
        Set<T> symmetricDifference = new HashSet<>(set1);
        // Adding elements from the second set
        symmetricDifference.addAll(set2);

        // Creating a set for the intersection of the two sets
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Removing the intersection from the symmetric difference set
        symmetricDifference.removeAll(intersection);

        return symmetricDifference;
    }

    // Main method to demonstrate computing the symmetric difference
    public static void main(String[] args) {
        // Creating the first HashSet of integers
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Creating the second HashSet of integers
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Displaying the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Computing the symmetric difference
        Set<Integer> symmetricDifference = computeSymmetricDifference(set1, set2);
        System.out.println("Symmetric Difference of Set 1 and Set 2: " + symmetricDifference);
    }
}
