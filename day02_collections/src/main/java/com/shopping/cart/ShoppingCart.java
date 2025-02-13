package com.shopping.cart;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Class to manage a shopping cart
public class ShoppingCart {
    private Map<String, Double> cart;

    // Constructor to initialize the cart using LinkedHashMap to preserve order
    public ShoppingCart() {
        cart = new LinkedHashMap<>();
    }

    // Method to add a product to the cart
    public void addProduct(String productName, double price) {
        cart.put(productName, price);
    }

    // Method to remove a product from the cart
    public void removeProduct(String productName) {
        cart.remove(productName);
    }

    // Method to display the cart in the order items were added
    public Map<String, Double> getCartInOrder() {
        return new LinkedHashMap<>(cart);
    }

    // Method to display the cart with items sorted by price
    public Map<String, Double> getCartSortedByPrice() {
        // Using TreeMap with the PriceSorter comparator
        TreeMap<String, Double> sortedCart = new TreeMap<>(new PriceSorter(cart));
        sortedCart.putAll(cart);
        return sortedCart;
    }
}
