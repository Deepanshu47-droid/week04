package com.datastructures.set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceFinderTest {
    private Set<Integer> set1;
    private Set<Integer> set2;
    private Set<Integer> set3;

    @BeforeEach
    void setUp() {
        // Initializing sets before each test
        set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(5);
    }

    @Test
    void testComputeSymmetricDifference() {
        // Computing the symmetric difference between set1 and set2
        Set<Integer> result = SymmetricDifferenceFinder.computeSymmetricDifference(set1, set2);

        // Expected result: {1, 2, 4, 5}
        assertEquals(4, result.size(), "Symmetric difference should contain 4 elements");
        assertTrue(result.contains(1) && result.contains(5), "Result should contain 1, 2, 4, 5");
    }

    @Test
    void testComputeSymmetricDifferenceWithIdenticalSets() {
        // Computing the symmetric difference between identical sets
        Set<Integer> result = SymmetricDifferenceFinder.computeSymmetricDifference(set1, set1);

        // Expected result: empty set
        assertTrue(result.isEmpty(), "Symmetric difference of identical sets should be empty");
    }

    @Test
    void testComputeSymmetricDifferenceWithDisjointSets() {
        // Computing the symmetric difference between set1 and set3
        Set<Integer> result = SymmetricDifferenceFinder.computeSymmetricDifference(set1, set3);

        // Expected result: {4, 5}
        assertEquals(2, result.size(), "Symmetric difference should contain 2 elements");
        assertTrue(result.contains(4) && result.contains(5), "Result should contain 4 and 5");
    }
}
