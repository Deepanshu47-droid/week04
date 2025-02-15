package com.junittesting.basic.listmanager;

import java.util.List;

public class ListManager {

    // Method to add an element to the list
    public void addElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.add(element);
    }

    // Method to remove an element from the list
    public boolean removeElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return list.remove(Integer.valueOf(element)); // Avoids index-based removal
    }

    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return list.size();
    }
}

