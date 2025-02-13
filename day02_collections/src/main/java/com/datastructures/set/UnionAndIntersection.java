package com.datastructures.set;

import java.util.HashSet;
import java.util.Set;

// Class to compute the union and intersection of two sets
public class UnionAndIntersection {

    // Method to compute the union of two sets
    public static <T> Set<T> computeUnion(Set<T> set1, Set<T> set2) {
        // Creating a new set to hold the union
        Set<T> unionSet = new HashSet<>(set1);
        // Adding all elements from the second set
        unionSet.addAll(set2);
        return unionSet;
    }

    // Method to compute the intersection of two sets
    public static <T> Set<T> computeIntersection(Set<T> set1, Set<T> set2) {
        // Creating a new set to hold the intersection
        Set<T> intersectionSet = new HashSet<>(set1);
        // Retaining only elements that are in both sets
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    // Main method to demonstrate union and intersection of two sets
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

        // Computing the union of the sets
        Set<Integer> unionSet = computeUnion(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        // Computing the intersection of the sets
        Set<Integer> intersectionSet = computeIntersection(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);
    }
}
