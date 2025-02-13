package com.datastructures.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Class to reverse elements of a list without using built-in methods
public class ListReverser {

    // Method to reverse a list (works for both ArrayList and LinkedList)
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>();

        // Iterate from the end of the list and add elements to the new list
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    // Main method to demonstrate reversing a list
    public static void main(String[] args) {
        // Creating ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        List<Integer> reversedArrayList = reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        // Creating LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println("Original LinkedList: " + linkedList);
        List<String> reversedLinkedList = reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
    }
}
