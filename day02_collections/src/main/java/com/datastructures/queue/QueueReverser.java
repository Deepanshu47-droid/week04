package com.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Class to reverse elements of a queue using only queue operations
public class QueueReverser {

    // Method to reverse a queue using a stack
    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        // Creating a stack to reverse the order of elements
        Stack<T> stack = new Stack<>();

        // Removing elements from the queue and pushing them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Popping elements from the stack and adding them back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }

    // Main method to demonstrate reversing elements in a queue
    public static void main(String[] args) {
        // Creating a LinkedList-based queue of integers
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Displaying the original queue
        System.out.println("Original Queue: " + queue);

        // Reversing the queue
        Queue<Integer> reversedQueue = reverseQueue(queue);

        // Displaying the reversed queue
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}
