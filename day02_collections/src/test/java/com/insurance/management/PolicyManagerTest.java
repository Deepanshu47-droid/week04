package com.insurance.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PolicyManagerTest {
    private PolicyManager policyManager;

    @BeforeEach
    void setUp() {
        policyManager = new PolicyManager();

        // Adding sample policies with different expiry dates
        policyManager.addPolicy(new Policy("P1001", "Raj Verma", LocalDate.now().plusDays(10), "Health", 1200.50));
        policyManager.addPolicy(new Policy("P1002", "Gagan Sharma", LocalDate.now().plusDays(20), "Auto", 800.00));
        policyManager.addPolicy(new Policy("P1003", "Shubham Jain", LocalDate.now().plusDays(40), "Home", 1500.75));
        policyManager.addPolicy(new Policy("P1004", "Deepanshu Malviya", LocalDate.now().plusDays(5), "Health", 1000.00));
        policyManager.addPolicy(new Policy("P1005", "Karan Mehta", LocalDate.now().minusDays(10), "Auto", 900.00)); // Already expired
    }

    @Test
    void testAddPolicy() {
        int initialSize = policyManager.getAllPolicies().size();
        policyManager.addPolicy(new Policy("P1006", "Yogesh Kumar", LocalDate.of(2025, 5, 5), "Health", 1500.00));
        assertEquals(initialSize + 1, policyManager.getAllPolicies().size(), "Policy count should increase by 1");
    }

    @Test
    void testGetAllPolicies() {
        Set<Policy> allPolicies = policyManager.getAllPolicies();
        assertEquals(5, allPolicies.size(), "There should be 5 policies initially");
        assertTrue(allPolicies.stream().anyMatch(p -> p.getPolicyNumber().equals("P1001")), "Policy P1001 should exist");
        assertTrue(allPolicies.stream().anyMatch(p -> p.getPolicyholderName().equals("Deepanshu Malviya")), "Policyholder Deepanshu Malviya should exist");
    }

    @Test
    void testGetPoliciesExpiringSoon() {
        Set<Policy> expiringPolicies = policyManager.getPoliciesExpiringSoon();
        assertEquals(3, expiringPolicies.size(), "There should be 3 policies expiring within the next 30 days");
        assertTrue(expiringPolicies.stream().anyMatch(p -> p.getPolicyNumber().equals("P1001")), "Policy P1001 should be expiring soon");
        assertTrue(expiringPolicies.stream().anyMatch(p -> p.getPolicyNumber().equals("P1002")), "Policy P1002 should be expiring soon");
        assertTrue(expiringPolicies.stream().anyMatch(p -> p.getPolicyNumber().equals("P1004")), "Policy P1004 should be expiring soon");
    }

    @Test
    void testGetPoliciesExpiringSoonNoneFound() {
        PolicyManager emptyManager = new PolicyManager(); // New manager with no policies
        Set<Policy> expiringPolicies = emptyManager.getPoliciesExpiringSoon();
        assertTrue(expiringPolicies.isEmpty(), "No policies should be expiring within the next 30 days");
    }
}
