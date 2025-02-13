package com.datastructures.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {
    private List<String> fruits;

    @BeforeEach
    void setUp() {
        // Initializing a list of strings with duplicate elements before each test
        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
    }

    @Test
    void testCountFrequency() {
        // Counting the frequency of elements in the list
        Map<String, Integer> frequencyMap = ElementFrequencyCounter.countFrequency(fruits);

        // Verifying the frequency of each element
        assertEquals(3, frequencyMap.get("apple"), "Frequency of 'apple' should be 3");
        assertEquals(2, frequencyMap.get("banana"), "Frequency of 'banana' should be 2");
        assertEquals(1, frequencyMap.get("orange"), "Frequency of 'orange' should be 1");
    }

    @Test
    void testCountFrequencyWithEmptyList() {
        List<String> emptyList = new ArrayList<>();

        // Counting the frequency of elements in an empty list
        Map<String, Integer> frequencyMap = ElementFrequencyCounter.countFrequency(emptyList);

        // Verifying that the frequency map is empty
        assertTrue(frequencyMap.isEmpty(), "Frequency map should be empty for an empty list");
    }

    @Test
    void testCountFrequencyWithSingleElementList() {
        List<String> singleElementList = new ArrayList<>();
        singleElementList.add("apple");

        // Counting the frequency of elements in a single-element list
        Map<String, Integer> frequencyMap = ElementFrequencyCounter.countFrequency(singleElementList);

        // Verifying the frequency of the single element
        assertEquals(1, frequencyMap.get("apple"), "Frequency of 'apple' should be 1");
    }
}
