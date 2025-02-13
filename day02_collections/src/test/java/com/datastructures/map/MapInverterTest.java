package com.datastructures.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MapInverterTest {
    private Map<String, Integer> map;

    @BeforeEach
    void setUp() {
        // Initializing a sample map before each test
        map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        map.put("D", 3);
    }

    @Test
    void testInvertMap() {
        // Inverting the map
        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(map);

        // Verifying the inverted map size
        assertEquals(3, invertedMap.size(), "Inverted map should contain 3 keys");

        // Checking the list of keys for each value
        assertEquals(List.of("A", "C"), invertedMap.get(1), "Value 1 should map to keys A and C");
        assertEquals(List.of("B"), invertedMap.get(2), "Value 2 should map to key B");
        assertEquals(List.of("D"), invertedMap.get(3), "Value 3 should map to key D");
    }

    @Test
    void testInvertMapWithEmptyMap() {
        Map<String, Integer> emptyMap = new HashMap<>();

        // Inverting an empty map
        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(emptyMap);

        // Verifying that the inverted map is empty
        assertTrue(invertedMap.isEmpty(), "Inverted map should be empty for an empty input map");
    }

    @Test
    void testInvertMapWithSingleEntry() {
        Map<String, Integer> singleEntryMap = new HashMap<>();
        singleEntryMap.put("X", 42);

        // Inverting a single-entry map
        Map<Integer, List<String>> invertedMap = MapInverter.invertMap(singleEntryMap);

        // Verifying the inverted map
        assertEquals(1, invertedMap.size(), "Inverted map should contain 1 key");
        assertEquals(List.of("X"), invertedMap.get(42), "Value 42 should map to key X");
    }
}
