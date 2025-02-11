package com.smartwarehouse;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmartWarehouseTest {

    @Test
    void testAddAndRetrieveItems() {
        Storage<WarehouseItem> storage = new Storage<>();
        storage.addItem(new Electronics("Laptop", 80000));
        storage.addItem(new Groceries("Rice", 1200));
        storage.addItem(new Furniture("Chair", 2500));

        List<WarehouseItem> items = storage.getItems();
        assertEquals(3, items.size());
        assertTrue(items.get(0) instanceof Electronics);
        assertEquals("Laptop", items.get(0).getName());
    }

    @Test
    void testDisplayItems() {
        Storage<WarehouseItem> storage = new Storage<>();
        storage.addItem(new Electronics("Phone", 60000));
        storage.addItem(new Groceries("Wheat", 1000));

        storage.displayItems();
        // Visual verification to confirm the output is as expected
    }
}
