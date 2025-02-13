package com.datastructures.Queue;

import com.datastructures.queue.StackUsingQueues;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {
    private StackUsingQueues<Integer> stack;

    @BeforeEach
    void setUp() {
        // Initializing the stack before each test
        stack = new StackUsingQueues<>();
    }

    @Test
    void testPushAndPop() {
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Verifying that elements are popped in reverse order of insertion
        assertEquals(30, stack.pop(), "First popped element should be 30");
        assertEquals(20, stack.pop(), "Second popped element should be 20");
        assertEquals(10, stack.pop(), "Third popped element should be 10");
    }

    @Test
    void testTop() {
        // Pushing elements onto the stack
        stack.push(5);
        stack.push(15);

        // Verifying that the top element is correct without removing it
        assertEquals(15, stack.top(), "Top element should be 15");
        assertEquals(15, stack.pop(), "After checking top, first popped element should still be 15");
    }

    @Test
    void testIsEmpty() {
        // Verifying that the stack is initially empty
        assertTrue(stack.isEmpty(), "Stack should be empty initially");

        // Pushing an element and verifying it's not empty
        stack.push(42);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");

        // Popping the element and verifying the stack is empty again
        stack.pop();
        assertTrue(stack.isEmpty(), "Stack should be empty after popping the only element");
    }

    @Test
    void testPopFromEmptyStack() {
        // Verifying that popping from an empty stack throws an exception
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            stack.pop();
        });
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    void testTopFromEmptyStack() {
        // Verifying that getting the top element from an empty stack throws an exception
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            stack.top();
        });
        assertEquals("Stack is empty", exception.getMessage());
    }
}
