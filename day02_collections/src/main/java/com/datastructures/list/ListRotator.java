package com.datastructures.list;

import java.util.ArrayList;
import java.util.List;

// Class to rotate elements in a list by a given number of positions
public class ListRotator {

    // Method to rotate a list by a specified number of positions
    public static <T> List<T> rotateList(List<T> list, int positions) {
        int size = list.size();
        List<T> rotatedList = new ArrayList<>(size);

        // Adding null elements to initialize the list with the same size
        for (int i = 0; i < size; i++) {
            rotatedList.add(null);
        }

        // Rotating elements by calculating new positions
        for (int i = 0; i < size; i++) {
            int newPosition = (i + positions) % size;
            rotatedList.set(newPosition, list.get(i));
        }

        return rotatedList;
    }

    // Main method to demonstrate rotating elements in a list
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the original list
        System.out.println("Original List: " + numbers);

        // Rotating the list by 2 positions
        List<Integer> rotatedList = rotateList(numbers, 2);

        // Displaying the rotated list
        System.out.println("Rotated List by 2 positions: " + rotatedList);
    }
}
