package com.shopping.cart;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PriceSorterTest {

    @Test
    void testPriceSorterAscendingOrder() {
        // Creating a sample map of products with their prices
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Laptop", 80000.00);
        productPrices.put("Smartphone", 30000.00);
        productPrices.put("Headphones", 5000.00);
        productPrices.put("Smartwatch", 15000.00);

        // Creating a TreeMap with the PriceSorter comparator to sort products by price
        TreeMap<String, Double> sortedCart = new TreeMap<>(new PriceSorter(productPrices));
        sortedCart.putAll(productPrices);

        // Extracting prices to verify the order
        List<Double> sortedPrices = new ArrayList<>(sortedCart.values());

        // Ensuring the prices are in ascending order
        for (int i = 1; i < sortedPrices.size(); i++) {
            assertTrue(sortedPrices.get(i) >= sortedPrices.get(i - 1), "Prices should be in ascending order");
        }
    }

    @Test
    void testPriceSorterEqualPrices() {
        // Creating a sample map with equal prices
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Laptop", 50000.00);
        productPrices.put("Smartphone", 50000.00);
        productPrices.put("Tablet", 30000.00);

        // Creating a TreeMap with the PriceSorter comparator
        TreeMap<String, Double> sortedCart = new TreeMap<>(new PriceSorter(productPrices));
        sortedCart.putAll(productPrices);

        // Ensuring all products are present and sorted correctly
        assertEquals(3, sortedCart.size(), "The sorted cart should contain all products");
        assertEquals(30000.00, sortedCart.values().iterator().next(), "The first product should have the lowest price");
    }

    @Test
    void testPriceSorterEmptyMap() {
        // Creating an empty map
        Map<String, Double> productPrices = new HashMap<>();

        // Creating a TreeMap with the PriceSorter comparator
        TreeMap<String, Double> sortedCart = new TreeMap<>(new PriceSorter(productPrices));
        sortedCart.putAll(productPrices);

        // Ensuring the sorted cart is empty
        assertTrue(sortedCart.isEmpty(), "The sorted cart should be empty");
    }
}
