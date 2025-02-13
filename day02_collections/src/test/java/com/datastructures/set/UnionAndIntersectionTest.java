package com.datastructures.set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionTest {
    private Set<Integer> set1;
    private Set<Integer> set2;

    @BeforeEach
    void setUp() {
        // Initializing two sample sets before each test
        set1 = new HashSet<>();
        set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);
    }

    @Test
    void testUnion() {
        // Creating an instance of UnionAndIntersection class
        UnionAndIntersection unionAndIntersection = new UnionAndIntersection();

        // Performing union of set1 and set2
        Set<Integer> result = unionAndIntersection.computeUnion(set1, set2);

        // Expected result: {1, 2, 3, 4, 5}
        assertEquals(5, result.size(), "Union should contain 5 elements");
        assertTrue(result.contains(1) && result.contains(5), "Result should contain all elements from both sets");
    }

    @Test
    void testIntersection() {
        // Creating an instance of UnionAndIntersection class
        UnionAndIntersection unionAndIntersection = new UnionAndIntersection();

        // Performing intersection of set1 and set2
        Set<Integer> result = unionAndIntersection.computeIntersection(set1, set2);

        // Expected result: {3}
        assertEquals(1, result.size(), "Intersection should contain 1 element");
        assertTrue(result.contains(3), "Result should contain only the common element 3");
    }
}
