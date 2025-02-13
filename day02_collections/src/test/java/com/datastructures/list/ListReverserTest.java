package com.datastructures.list;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListReverserTest {
    private List<Integer> arrayList;
    private List<String> linkedList;

    @BeforeEach
    void setUp() {
        // Initializing an ArrayList of integers
        arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Initializing a LinkedList of strings
        linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
    }

    @Test
    void testReverseArrayList() {
        // Reversing the ArrayList
        List<Integer> reversedList = ListReverser.reverseList(arrayList);

        // Expected result: [5, 4, 3, 2, 1]
        assertEquals(5, reversedList.size(), "Reversed list should have 5 elements");
        assertEquals(List.of(5, 4, 3, 2, 1), reversedList, "ArrayList should be reversed correctly");
    }

    @Test
    void testReverseLinkedList() {
        // Reversing the LinkedList
        List<String> reversedList = ListReverser.reverseList(linkedList);

        // Expected result: ["D", "C", "B", "A"]
        assertEquals(4, reversedList.size(), "Reversed list should have 4 elements");
        assertEquals(List.of("D", "C", "B", "A"), reversedList, "LinkedList should be reversed correctly");
    }

    @Test
    void testReverseEmptyList() {
        List<Integer> emptyList = new ArrayList<>();

        // Reversing an empty list
        List<Integer> reversedList = ListReverser.reverseList(emptyList);

        // Verifying that the reversed list is empty
        assertTrue(reversedList.isEmpty(), "Reversed list should be empty for an empty input list");
    }

    @Test
    void testReverseSingleElementList() {
        List<String> singleElementList = new ArrayList<>();
        singleElementList.add("Z");

        // Reversing a single-element list
        List<String> reversedList = ListReverser.reverseList(singleElementList);

        // Verifying that the reversed list contains the same single element
        assertEquals(1, reversedList.size(), "Reversed list should contain 1 element");
        assertEquals(List.of("Z"), reversedList, "Single-element list should remain unchanged after reversing");
    }
}
