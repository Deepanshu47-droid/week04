package com.shopping.cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();

        // Adding sample products
        cart.addProduct("Laptop", 80000.00);
        cart.addProduct("Smartphone", 30000.00);
        cart.addProduct("Headphones", 5000.00);
        cart.addProduct("Smartwatch", 15000.00);
    }

    @Test
    void testAddProduct() {
        int initialSize = cart.getCartInOrder().size();
        cart.addProduct("Tablet", 25000.00);
        assertEquals(initialSize + 1, cart.getCartInOrder().size(), "Product count should increase by 1");
    }

    @Test
    void testRemoveProduct() {
        cart.removeProduct("Smartphone");
        assertFalse(cart.getCartInOrder().containsKey("Smartphone"), "Smartphone should be removed from the cart");
    }

    @Test
    void testGetCartInOrder() {
        Map<String, Double> cartInOrder = cart.getCartInOrder();
        assertEquals(4, cartInOrder.size(), "Cart should contain 4 products");
        assertEquals(80000.00, cartInOrder.get("Laptop"), "Laptop price should be ₹80000.00");
    }

    @Test
    void testGetCartSortedByPrice() {
        Map<String, Double> sortedCart = cart.getCartSortedByPrice();
        assertEquals(5000.00, sortedCart.values().iterator().next(), "First product in sorted cart should have price ₹5000.00");
        assertTrue(sortedCart.containsKey("Headphones"), "Headphones should be present in the sorted cart");
    }

    @Test
    void testGetCartSortedByPriceOrder() {
        Map<String, Double> sortedCart = cart.getCartSortedByPrice();
        Double[] sortedPrices = sortedCart.values().toArray(new Double[0]);
        for (int i = 1; i < sortedPrices.length; i++) {
            assertTrue(sortedPrices[i] >= sortedPrices[i - 1], "Prices should be in ascending order");
        }
    }
}
