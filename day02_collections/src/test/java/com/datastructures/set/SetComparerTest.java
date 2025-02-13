package com.datastructures.set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SetComparerTest {
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
        set2.add(1);
        set2.add(2);

        set3 = new HashSet<>();
        set3.add(4);
        set3.add(5);
        set3.add(6);
    }

    @Test
    void testAreSetsEqual_SameElements() {
        // Verifying that set1 and set2 are equal
        assertTrue(SetComparator.areSetsEqual(set1, set2), "set1 and set2 should be equal");
    }

    @Test
    void testAreSetsEqual_DifferentElements() {
        // Verifying that set1 and set3 are not equal
        assertFalse(SetComparator.areSetsEqual(set1, set3), "set1 and set3 should not be equal");
    }

    @Test
    void testAreSetsEqual_EmptySets() {
        Set<Integer> emptySet1 = new HashSet<>();
        Set<Integer> emptySet2 = new HashSet<>();

        // Verifying that two empty sets are equal
        assertTrue(SetComparator.areSetsEqual(emptySet1, emptySet2), "Two empty sets should be equal");
    }
}
