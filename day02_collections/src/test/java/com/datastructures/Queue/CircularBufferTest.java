package com.datastructures.Queue;

import com.datastructures.queue.CircularBuffer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {
    private CircularBuffer<Integer> buffer;

    @BeforeEach
    void setUp() {
        // Initializing a circular buffer with a capacity of 3
        buffer = new CircularBuffer<>(3);
    }

    @Test
    void testAddAndGetElements() {
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);

        // Verifying that the buffer contains the correct elements in the expected order
        assertArrayEquals(new Integer[]{1, 2, 3}, buffer.getElements(), "Buffer should contain [1, 2, 3]");
    }

    @Test
    void testAddWithOverwrite() {
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4);  // This should overwrite the oldest element (1)

        // Verifying that the buffer contains the correct elements after overwriting
        assertArrayEquals(new Integer[]{2, 3, 4}, buffer.getElements(), "Buffer should contain [2, 3, 4]");
    }

    @Test
    void testAddAndGetElementsMultipleOverwrites() {
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4);  // Overwrite 1
        buffer.add(5);  // Overwrite 2
        buffer.add(6);  // Overwrite 3

        // Verifying that the buffer contains the last 3 added elements
        assertArrayEquals(new Integer[]{4, 5, 6}, buffer.getElements(), "Buffer should contain [4, 5, 6]");
    }

    @Test
    void testGetElementsEmptyBuffer() {
        // Verifying that an empty buffer returns an empty array
        assertArrayEquals(new Integer[]{}, buffer.getElements(), "Buffer should be empty");
    }

    @Test
    void testAddSingleElement() {
        buffer.add(42);

        // Verifying that the buffer contains only the single element
        assertArrayEquals(new Integer[]{42}, buffer.getElements(), "Buffer should contain [42]");
    }
}
