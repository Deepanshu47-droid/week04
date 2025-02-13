package com.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

// Class to implement a stack using two queues
public class StackUsingQueues<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;

    // Constructor to initialize two queues
    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Method to push an element onto the stack
    public void push(T element) {
        // Adding the element to queue1
        queue1.add(element);
    }

    // Method to pop an element from the stack
    public T pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Moving elements from queue1 to queue2, leaving the last element
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // The last element of queue1 is the top of the stack
        T topElement = queue1.remove();

        // Swap the references of queue1 and queue2
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Method to get the top element without removing it
    public T top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Moving elements to queue2 and tracking the last element
        T topElement = null;
        while (!queue1.isEmpty()) {
            topElement = queue1.remove();
            queue2.add(topElement);
        }

        // Swap the references of queue1 and queue2
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        // Creating a stack of integers
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Displaying the top element
        System.out.println("Top element: " + stack.top());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
