package com.datastructures.set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SubsetCheckerTest {
    private Set<Integer> set1;
    private Set<Integer> set2;
    private Set<Integer> set3;

    @BeforeEach
    void setUp() {
        // Initializing the sets before each test
        set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        set3 = new HashSet<>();
        set3.add(5);
        set3.add(6);
    }

    @Test
    void testIsSubset_True() {
        // Verifying that set1 is a subset of set2
        assertTrue(SubsetChecker.isSubset(set1, set2), "set1 should be a subset of set2");
    }

    @Test
    void testIsSubset_False() {
        // Verifying that set1 is not a subset of set3
        assertFalse(SubsetChecker.isSubset(set1, set3), "set1 should not be a subset of set3");
    }

    @Test
    void testIsSubset_EmptySet() {
        Set<Integer> emptySet = new HashSet<>();

        // Verifying that an empty set is a subset of any set
        assertTrue(SubsetChecker.isSubset(emptySet, set2), "An empty set should be a subset of any set");
    }
}
