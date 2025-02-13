package com.datastructures.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateRemoverTest {
    private List<Integer> numbers;

    @BeforeEach
    void setUp() {
        // Initializing a list of integers with duplicates before each test
        numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @Test
    void testRemoveDuplicates() {
        // Removing duplicates while preserving order
        List<Integer> result = DuplicateRemover.removeDuplicates(numbers);

        // Expected result: [3, 1, 2, 4]
        assertEquals(4, result.size(), "Result list should contain 4 elements");
        assertEquals(List.of(3, 1, 2, 4), result, "List should be [3, 1, 2, 4] after removing duplicates");
    }

    @Test
    void testRemoveDuplicatesFromEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        // Removing duplicates from an empty list
        List<Integer> result = DuplicateRemover.removeDuplicates(emptyList);

        // Verifying that the result list is empty
        assertTrue(result.isEmpty(), "Result list should be empty for an empty input list");
    }

    @Test
    void testRemoveDuplicatesWithSingleElementList() {
        List<Integer> singleElementList = new ArrayList<>();
        singleElementList.add(5);

        // Removing duplicates from a single-element list
        List<Integer> result = DuplicateRemover.removeDuplicates(singleElementList);

        // Verifying that the result list contains only one element
        assertEquals(1, result.size(), "Result list should contain 1 element");
        assertEquals(List.of(5), result, "List should be [5]");
    }
}
