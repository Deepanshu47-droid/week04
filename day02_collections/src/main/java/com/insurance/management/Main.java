package com.insurance.management;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.insurance.comparison.PolicyPerformanceComparer;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding sample policies using preferred names
        manager.addPolicy(new Policy("P1001", "Raj Verma", LocalDate.of(2025, 3, 15), "Health", 1200.50));
        manager.addPolicy(new Policy("P1002", "Gagan Sharma", LocalDate.of(2025, 2, 28), "Auto", 800.00));
        manager.addPolicy(new Policy("P1003", "Shubham Jain", LocalDate.of(2025, 1, 20), "Home", 1500.75));
        manager.addPolicy(new Policy("P1004", "Deepanshu Malviya", LocalDate.of(2025, 4, 10), "Health", 1000.00));
        manager.addPolicy(new Policy("P1005", "Karan Mehta", LocalDate.of(2025, 1, 25), "Auto", 900.00));

        // Displaying all policies
        System.out.println("All Policies:");
        for (Policy policy : manager.getAllPolicies()) {
            System.out.println(policy);
        }

        // Displaying policies expiring within the next 30 days
        System.out.println("\nPolicies Expiring Soon:");
        for (Policy policy : manager.getPoliciesExpiringSoon()) {
            System.out.println(policy);
        }
    }

}
