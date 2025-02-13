package com.shopping.cart;

import java.util.Comparator;
import java.util.Map;

public class PriceSorter implements Comparator<String> {
    private Map<String, Double> productPrices;

    // Constructor to initialize with product prices
    public PriceSorter(Map<String, Double> productPrices) {
        this.productPrices = productPrices;
    }

    // Comparing products by price, and by product name if prices are equal
    @Override
    public int compare(String product1, String product2) {
        Double price1 = productPrices.get(product1);
        Double price2 = productPrices.get(product2);

        int priceComparison = price1.compareTo(price2);
        if (priceComparison != 0) {
            return priceComparison;
        }
        // If prices are equal, compare by product name to avoid key conflicts
        return product1.compareTo(product2);
    }
}
