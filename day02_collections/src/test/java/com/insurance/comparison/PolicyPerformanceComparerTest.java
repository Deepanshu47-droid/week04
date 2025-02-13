package com.insurance.comparison;

import com.insurance.management.Policy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class PolicyPerformanceComparerTest {
    private Set<Policy> hashSet;
    private Set<Policy> linkedHashSet;
    private Set<Policy> treeSet;

    @BeforeEach
    void setUp() {
        hashSet = new HashSet<>();
        linkedHashSet = new LinkedHashSet<>();
        treeSet = new TreeSet<>((p1, p2) -> p1.getPolicyNumber().compareTo(p2.getPolicyNumber()));
    }

    @Test
    void testMeasureAddPerformance() {
        System.out.println("---- Add Performance ----");
        PolicyPerformanceComparer.measureAddPerformance(hashSet, 100);
        PolicyPerformanceComparer.measureAddPerformance(linkedHashSet, 100);
        PolicyPerformanceComparer.measureAddPerformance(treeSet, 100);
    }

    @Test
    void testMeasureSearchPerformance() {
        // Adding 100 policies to each set
        for (int i = 1; i <= 100; i++) {
            Policy policy = new Policy("P" + i, "Deepanshu", LocalDate.of(2025, 3, 15), "Health", 1000.00 + i);
            hashSet.add(policy);
            linkedHashSet.add(policy);
            treeSet.add(policy);
        }

        System.out.println("\n---- Search Performance ----");
        PolicyPerformanceComparer.measureSearchPerformance(hashSet, "P50");
        PolicyPerformanceComparer.measureSearchPerformance(linkedHashSet, "P50");
        PolicyPerformanceComparer.measureSearchPerformance(treeSet, "P50");
    }

    @Test
    void testMeasureRemovePerformance() {
        // Adding 100 policies to each set
        for (int i = 1; i <= 100; i++) {
            Policy policy = new Policy("P" + i, "Gagan", LocalDate.of(2025, 3, 15), "Health", 1000.00 + i);
            hashSet.add(policy);
            linkedHashSet.add(policy);
            treeSet.add(policy);
        }

        System.out.println("\n---- Remove Performance ----");
        PolicyPerformanceComparer.measureRemovePerformance(hashSet, "P50");
        PolicyPerformanceComparer.measureRemovePerformance(linkedHashSet, "P50");
        PolicyPerformanceComparer.measureRemovePerformance(treeSet, "P50");
    }
}
