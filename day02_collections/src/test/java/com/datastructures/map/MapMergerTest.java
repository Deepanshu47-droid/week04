package com.datastructures.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MapMergerTest {
    private Map<String, Integer> map1;
    private Map<String, Integer> map2;

    @BeforeEach
    void setUp() {
        // Initializing the first sample map
        map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        // Initializing the second sample map
        map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        map2.put("D", 5);
    }

    @Test
    void testMergeMaps() {
        // Merging the two maps
        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, map2);

        // Verifying the size of the merged map
        assertEquals(4, mergedMap.size(), "Merged map should contain 4 keys");

        // Verifying the merged values
        assertEquals(1, mergedMap.get("A"), "Key 'A' should have value 1");
        assertEquals(5, mergedMap.get("B"), "Key 'B' should have value 5");
        assertEquals(7, mergedMap.get("C"), "Key 'C' should have value 7");
        assertEquals(5, mergedMap.get("D"), "Key 'D' should have value 5");
    }

    @Test
    void testMergeMapsWithEmptyMap() {
        Map<String, Integer> emptyMap = new HashMap<>();

        // Merging map1 with an empty map
        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, emptyMap);

        // Verifying that the merged map is equal to map1
        assertEquals(map1, mergedMap, "Merged map should be equal to map1 when merging with an empty map");
    }

    @Test
    void testMergeMapsWithDisjointKeys() {
        Map<String, Integer> disjointMap = new HashMap<>();
        disjointMap.put("X", 10);
        disjointMap.put("Y", 20);

        // Merging map1 with a map containing disjoint keys
        Map<String, Integer> mergedMap = MapMerger.mergeMaps(map1, disjointMap);

        // Verifying the merged map size
        assertEquals(5, mergedMap.size(), "Merged map should contain 5 keys");
        assertEquals(10, mergedMap.get("X"), "Key 'X' should have value 10");
        assertEquals(20, mergedMap.get("Y"), "Key 'Y' should have value 20");
    }
}
