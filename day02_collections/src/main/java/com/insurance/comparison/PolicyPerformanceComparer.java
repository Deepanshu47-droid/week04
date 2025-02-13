package com.insurance.comparison;

import com.insurance.management.Policy;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Class to compare the performance of HashSet, LinkedHashSet, and TreeSet
public class PolicyPerformanceComparer {

    // Method to add policies to a set and measure the time taken
    public static void measureAddPerformance(Set<Policy> set, int numberOfPolicies) {
        long startTime = System.nanoTime();
        for (int i = 1; i <= numberOfPolicies; i++) {
            set.add(new Policy("P" + i, "Raj", LocalDate.of(2025, 3, 15), "Health", 1000.00 + i));
        }
        long endTime = System.nanoTime();
        System.out.println(set.getClass().getSimpleName() + " - Add Performance: " + (endTime - startTime) + " ns");
    }

    // Method to search for a specific policy in a set and measure the time taken
    public static void measureSearchPerformance(Set<Policy> set, String policyNumber) {
        long startTime = System.nanoTime();
        boolean found = set.stream().anyMatch(policy -> policy.getPolicyNumber().equals(policyNumber));
        long endTime = System.nanoTime();
        System.out.println(set.getClass().getSimpleName() + " - Search Performance: " + (endTime - startTime) + " ns | Found: " + found);
    }

    // Method to remove a policy from a set and measure the time taken
    public static void measureRemovePerformance(Set<Policy> set, String policyNumber) {
        long startTime = System.nanoTime();
        set.removeIf(policy -> policy.getPolicyNumber().equals(policyNumber));
        long endTime = System.nanoTime();
        System.out.println(set.getClass().getSimpleName() + " - Remove Performance: " + (endTime - startTime) + " ns");
    }
}
