package com.datastructures.Queue;

import com.datastructures.queue.QueueReverser;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class QueueReverserTest {

    @Test
    void testReverseQueue() {
        // Creating a queue with sample elements
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Reversing the queue
        Queue<Integer> reversedQueue = QueueReverser.reverseQueue(queue);

        // Verifying the order of elements in the reversed queue
        assertEquals(30, reversedQueue.remove(), "First element should be 30");
        assertEquals(20, reversedQueue.remove(), "Second element should be 20");
        assertEquals(10, reversedQueue.remove(), "Third element should be 10");
    }

    @Test
    void testReverseQueueSingleElement() {
        // Creating a queue with a single element
        Queue<Integer> queue = new LinkedList<>();
        queue.add(42);

        // Reversing the queue
        Queue<Integer> reversedQueue = QueueReverser.reverseQueue(queue);

        // Verifying that the queue remains unchanged
        assertEquals(42, reversedQueue.remove(), "Single element should remain 42");
        assertTrue(reversedQueue.isEmpty(), "Queue should be empty after removing the single element");
    }

    @Test
    void testReverseQueueEmpty() {
        // Creating an empty queue
        Queue<Integer> queue = new LinkedList<>();

        // Reversing the empty queue
        Queue<Integer> reversedQueue = QueueReverser.reverseQueue(queue);

        // Verifying that the queue is still empty
        assertTrue(reversedQueue.isEmpty(), "Reversed queue should be empty");
    }
}
