package com.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

// Class to generate binary numbers using a queue
public class BinaryNumberGenerator {

    // Method to generate the first N binary numbers
    public static void generateBinaryNumbers(int n) {
        // Creating a queue to store binary numbers as strings
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Generating binary numbers using a queue
        for (int i = 1; i <= n; i++) {
            // Removing the front element and displaying it
            String current = queue.remove();
            System.out.println(current);

            // Adding the next two binary numbers to the queue
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    // Main method to demonstrate generating binary numbers
    public static void main(String[] args) {
        int n = 5;

        // Generating and displaying the first 5 binary numbers
        System.out.println("First " + n + " Binary Numbers:");
        generateBinaryNumbers(n);
    }
}
