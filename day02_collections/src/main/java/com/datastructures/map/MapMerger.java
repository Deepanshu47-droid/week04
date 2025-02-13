package com.datastructures.map;

import java.util.HashMap;
import java.util.Map;

// Class to merge two maps and sum values for duplicate keys
public class MapMerger {

    // Method to merge two maps and sum values for keys that exist in both
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Iterating through the second map
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            // Summing values if the key already exists
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }

    // Main method to demonstrate merging two maps
    public static void main(String[] args) {
        // Creating the first sample map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        // Creating the second sample map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        map2.put("D", 5);

        // Merging the two maps
        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        // Displaying the merged map
        System.out.println("Merged Map: " + mergedMap);
    }
}
