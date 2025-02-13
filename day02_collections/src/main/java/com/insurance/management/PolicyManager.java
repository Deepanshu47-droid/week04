package com.insurance.management;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

// Class to manage insurance policies
public class PolicyManager {
    private Set<Policy> policies;

    // Constructor to initialize the policy set
    public PolicyManager() {
        policies = new HashSet<>();
    }

    // Method to add a policy
    public void addPolicy(Policy policy) {
        policies.add(policy);
    }

    // Method to retrieve all policies
    public Set<Policy> getAllPolicies() {
        return policies;
    }

    // Method to retrieve policies expiring within the next 30 days
    public Set<Policy> getPoliciesExpiringSoon() {
        Set<Policy> expiringPolicies = new HashSet<>();
        LocalDate today = LocalDate.now();
        for (Policy policy : policies) {
            if (policy.getExpiryDate().isBefore(today.plusDays(30)) && policy.getExpiryDate().isAfter(today)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }
}
