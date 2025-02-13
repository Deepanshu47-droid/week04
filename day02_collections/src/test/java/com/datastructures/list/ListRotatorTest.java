package com.datastructures.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListRotatorTest {
    private List<Integer> numbers;

    @BeforeEach
    void setUp() {
        // Initializing a list of integers before each test
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
    }

    @Test
    void testRotateListByTwoPositions() {
        // Rotating the list by 3 positions
        List<Integer> rotatedList = ListRotator.rotateList(numbers, 3);

        // Expected result: [30, 40, 50, 10, 20]
        assertEquals(List.of(30, 40, 50, 10, 20), rotatedList, "List should be rotated by 2 positions");
    }

    @Test
    void testRotateListByZeroPositions() {
        // Rotating the list by 0 positions (no change expected)
        List<Integer> rotatedList = ListRotator.rotateList(numbers, 0);

        // Expected result: [10, 20, 30, 40, 50]
        assertEquals(List.of(10, 20, 30, 40, 50), rotatedList, "List should remain unchanged when rotated by 0 positions");
    }

    @Test
    void testRotateListBySizePositions() {
        // Rotating the list by its size (no change expected)
        List<Integer> rotatedList = ListRotator.rotateList(numbers, numbers.size());

        // Expected result: [10, 20, 30, 40, 50]
        assertEquals(List.of(10, 20, 30, 40, 50), rotatedList, "List should remain unchanged when rotated by its size");
    }

    @Test
    void testRotateListWithEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        // Rotating an empty list
        List<Integer> rotatedList = ListRotator.rotateList(emptyList, 2);

        // Verifying that the rotated list is empty
        assertTrue(rotatedList.isEmpty(), "Rotated list should be empty for an empty input list");
    }
}
