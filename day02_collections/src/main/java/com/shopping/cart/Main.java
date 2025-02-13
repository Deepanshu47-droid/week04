package com.shopping.cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addProduct("Laptop", 80000.00);
        cart.addProduct("Smartphone", 30000.00);
        cart.addProduct("Headphones", 5000.00);
        cart.addProduct("Smartwatch", 15000.00);

        // Displaying cart in the order items were added
        System.out.println("Cart in Order of Addition:");
        cart.getCartInOrder().forEach((product, price) ->
                System.out.println(product + ": ₹" + price));

        // Displaying cart sorted by price
        System.out.println("\nCart Sorted by Price:");
        cart.getCartSortedByPrice().forEach((product, price) ->
                System.out.println(product + ": ₹" + price));
    }
}
