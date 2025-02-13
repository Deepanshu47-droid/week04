package com.datastructures.queue;

import java.util.Arrays;

// Class to implement a circular buffer (fixed-size queue)
public class CircularBuffer<T> {
    private T[] buffer;
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private int capacity;

    // Constructor to initialize the buffer with a fixed capacity
    @SuppressWarnings("unchecked")
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = (T[]) new Object[capacity];
    }

    // Method to add an element to the buffer
    public void add(T element) {
        if (size == capacity) {
            // Overwriting the oldest element
            head = (head + 1) % capacity;
        } else {
            size++;
        }
        buffer[tail] = element;
        tail = (tail + 1) % capacity;
    }

    // Method to get all elements in the buffer in the correct order
    public T[] getElements() {
        @SuppressWarnings("unchecked")
        T[] elements = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            elements[i] = buffer[(head + i) % capacity];  // Ensure correct wrapping around the buffer
        }
        return elements;
    }


    // Method to display the elements in the buffer
    public void displayBuffer() {
        System.out.println("Buffer: " + Arrays.toString(getElements()));
    }

    // Main method to demonstrate the circular buffer
    public static void main(String[] args) {
        // Creating a circular buffer with a capacity of 3
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);

        // Adding elements to the buffer
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.displayBuffer();

        // Adding another element, overwriting the oldest one
        buffer.add(4);
        buffer.displayBuffer();

        // Adding more elements
        buffer.add(5);
        buffer.add(6);
        buffer.displayBuffer();
    }
}
