package com.datastructures.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class to invert a map from K -> V to V -> List<K>
public class MapInverter {

    // Method to invert a map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        // Iterating through the original map
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // Adding the key to the list of keys for the corresponding value
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }

    // Main method to demonstrate inverting a map
    public static void main(String[] args) {
        // Creating a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        map.put("D", 3);

        // Inverting the map
        Map<Integer, List<String>> invertedMap = invertMap(map);

        // Displaying the inverted map
        System.out.println("Inverted Map: " + invertedMap);
    }
}
