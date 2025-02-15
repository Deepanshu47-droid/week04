package com.junittesting.basic.listmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager listManager;
    private List<Integer> testList;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        testList = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(testList, 10);
        assertEquals(1, testList.size());
        assertTrue(testList.contains(10));
    }

    @Test
    void testRemoveElement() {
        testList.add(20);
        boolean removed = listManager.removeElement(testList, 20);
        assertTrue(removed);
        assertFalse(testList.contains(20));
    }

    @Test
    void testGetSize() {
        testList.add(5);
        testList.add(15);
        assertEquals(2, listManager.getSize(testList));
    }

    @Test
    void testRemoveElement_NotFound() {
        testList.add(30);
        boolean removed = listManager.removeElement(testList, 40);
        assertFalse(removed);
    }

    @Test
    void testAddElementWithNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            listManager.addElement(null, 10);
        });
        assertEquals("List cannot be null", exception.getMessage());
    }

    @Test
    void testRemoveElementWithNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            listManager.removeElement(null, 10);
        });
        assertEquals("List cannot be null", exception.getMessage());
    }

    @Test
    void testGetSizeWithNullList() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            listManager.getSize(null);
        });
        assertEquals("List cannot be null", exception.getMessage());
    }
}
