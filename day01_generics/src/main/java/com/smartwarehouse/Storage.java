package com.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

// Generic class for Storage
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void displayItems() {
        System.out.println("Items in storage:");
        for (T item : items) {
            System.out.println(item);
        }
    }
}