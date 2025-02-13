package com.datastructures.map;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void testCountWordFrequency() {
        // Sample text input
        String text = "Hello world, hello Java! Welcome to the world of Java programming.";

        // Counting word frequency
        Map<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(text);

        // Verifying the word frequencies
        assertEquals(2, wordFrequency.get("hello"), "Frequency of 'hello' should be 2");
        assertEquals(2, wordFrequency.get("world"), "Frequency of 'world' should be 2");
        assertEquals(2, wordFrequency.get("java"), "Frequency of 'java' should be 2");
        assertEquals(1, wordFrequency.get("welcome"), "Frequency of 'welcome' should be 1");
        assertEquals(1, wordFrequency.get("programming"), "Frequency of 'programming' should be 1");
    }

    @Test
    void testCountWordFrequencyEmptyText() {
        // Empty text input
        String text = "";

        // Counting word frequency for an empty string
        Map<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(text);

        // Verifying that the map is empty
        assertTrue(wordFrequency.isEmpty(), "Word frequency map should be empty for an empty text");
    }

    @Test
    void testCountWordFrequencySingleWord() {
        // Single word text input
        String text = "Java";

        // Counting word frequency for a single word
        Map<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(text);

        // Verifying the frequency of the single word
        assertEquals(1, wordFrequency.get("java"), "Frequency of 'java' should be 1");
    }
}
