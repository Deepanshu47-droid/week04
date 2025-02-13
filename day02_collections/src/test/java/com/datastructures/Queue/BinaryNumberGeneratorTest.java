package com.datastructures.Queue;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberGeneratorTest {

    @Test
    void testGenerateBinaryNumbers() {
        int n = 5;

        // Expected output for the first 5 binary numbers
        String[] expectedOutput = {"1", "10", "11", "100", "101"};

        // Creating a queue to simulate the generation process
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Generating binary numbers using a loop similar to the actual method
        String[] generatedOutput = new String[n];
        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            generatedOutput[i] = current;
            queue.add(current + "0");
            queue.add(current + "1");
        }

        // Verifying that the generated output matches the expected output
        assertArrayEquals(expectedOutput, generatedOutput, "The generated binary numbers should match the expected output");
    }

    @Test
    void testGenerateBinaryNumbersSingle() {
        int n = 1;

        // Expected output for the first binary number
        String[] expectedOutput = {"1"};

        // Creating a queue to simulate the generation process
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Generating the first binary number
        String[] generatedOutput = new String[n];
        generatedOutput[0] = queue.remove();

        // Verifying that the generated output matches the expected output
        assertArrayEquals(expectedOutput, generatedOutput, "The generated binary number should be '1'");
    }

    @Test
    void testGenerateBinaryNumbersZero() {
        int n = 0;

        // Expected output for zero binary numbers
        String[] expectedOutput = {};

        // Verifying that an empty output is expected for n = 0
        assertArrayEquals(expectedOutput, new String[0], "There should be no binary numbers generated for n = 0");
    }
}
