package com.datastructures.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MaxValueKeyFinderTest {
    private Map<String, Integer> scores;

    @BeforeEach
    void setUp() {
        // Initializing a sample map with scores
        scores = new HashMap<>();
        scores.put("Deepanshu", 85);
        scores.put("Raj", 92);
        scores.put("Shubham", 88);
        scores.put("Gagan", 95);
    }

    @Test
    void testFindKeyWithMaxValue() {
        // Finding the key with the highest value
        String result = MaxValueKeyFinder.findKeyWithMaxValue(scores);

        // Verifying that the key with the highest value is "Gagan"
        assertEquals("Gagan", result, "Key with the highest value should be 'Gagan'");
    }

    @Test
    void testFindKeyWithMaxValueSingleEntry() {
        Map<String, Integer> singleEntryMap = new HashMap<>();
        singleEntryMap.put("Yogesh", 100);

        // Finding the key in a single-entry map
        String result = MaxValueKeyFinder.findKeyWithMaxValue(singleEntryMap);

        // Verifying the result
        assertEquals("Yogesh", result, "Key with the highest value should be 'Yogesh'");
    }

    @Test
    void testFindKeyWithMaxValueEmptyMap() {
        Map<String, Integer> emptyMap = new HashMap<>();

        // Verifying that an exception is thrown for an empty map
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                MaxValueKeyFinder.findKeyWithMaxValue(emptyMap)
        );
        assertEquals("The map is empty.", exception.getMessage());
    }
}
