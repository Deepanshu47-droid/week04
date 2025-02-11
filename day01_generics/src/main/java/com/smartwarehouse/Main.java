package com.smartwarehouse;

public class Main {
    public static void main(String[] args) {
        Storage<WarehouseItem> storage = new Storage<>();

        // Adding different types of items
        storage.addItem(new Electronics("Laptop", 80000));
        storage.addItem(new Groceries("Rice", 1200));
        storage.addItem(new Furniture("Chair", 2500));

        // Displaying all items
        storage.displayItems();
    }
}
