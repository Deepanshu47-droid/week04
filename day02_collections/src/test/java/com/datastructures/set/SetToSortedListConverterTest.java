package com.datastructures.set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SetToSortedListConverterTest {
    private Set<Integer> numberSet;

    @BeforeEach
    void setUp() {
        // Initializing a set of integers before each test
        numberSet = new HashSet<>();
        numberSet.add(5);
        numberSet.add(3);
        numberSet.add(9);
        numberSet.add(1);
    }

    @Test
    void testConvertToSortedList() {
        // Converting the set to a sorted list
        List<Integer> sortedList = SetToSortedListConverter.convertToSortedList(numberSet);

        // Verifying the sorted order
        assertEquals(4, sortedList.size(), "Sorted list should have 4 elements");
        assertEquals(List.of(1, 3, 5, 9), sortedList, "List should be sorted in ascending order");
    }

    @Test
    void testConvertEmptySet() {
        // Converting an empty set
        Set<Integer> emptySet = new HashSet<>();
        List<Integer> sortedList = SetToSortedListConverter.convertToSortedList(emptySet);

        // Verifying that the sorted list is empty
        assertTrue(sortedList.isEmpty(), "Sorted list should be empty for an empty set");
    }
}
