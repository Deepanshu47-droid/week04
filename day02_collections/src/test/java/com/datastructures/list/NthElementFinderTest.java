package com.datastructures.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NthElementFinderTest {
    private List<String> linkedList;

    @BeforeEach
    void setUp() {
        // Initializing a LinkedList of strings before each test
        linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
    }

    @Test
    void testFindNthFromEndValidPosition() {
        // Finding the 2nd element from the end
        String result = NthElementFinder.findNthFromEnd(linkedList, 2);
        assertEquals("D", result, "2nd element from the end should be 'D'");
    }

    @Test
    void testFindNthFromEndFirstElement() {
        // Finding the last element (1st from the end)
        String result = NthElementFinder.findNthFromEnd(linkedList, 1);
        assertEquals("E", result, "1st element from the end should be 'E'");
    }

    @Test
    void testFindNthFromEndInvalidPosition() {
        // Verifying that an exception is thrown for an invalid position (greater than list size)
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                NthElementFinder.findNthFromEnd(linkedList, 6)
        );
        assertEquals("Position exceeds list size", exception.getMessage());
    }

    @Test
    void testFindNthFromEndNegativePosition() {
        // Verifying that an exception is thrown for a negative position
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                NthElementFinder.findNthFromEnd(linkedList, -1)
        );
        assertEquals("Position must be greater than 0", exception.getMessage());
    }

    @Test
    void testFindNthFromEndEmptyList() {
        List<String> emptyList = new LinkedList<>();

        // Verifying that an exception is thrown for an empty list
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                NthElementFinder.findNthFromEnd(emptyList, 1)
        );
        assertEquals("Position exceeds list size", exception.getMessage());
    }
}
