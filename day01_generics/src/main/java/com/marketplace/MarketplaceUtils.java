package com.marketplace;

// Utility class containing a generic method to apply a discount to a product
public class MarketplaceUtils {

    // Generic method to apply discount to any Product type
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage!");
            return;
        }
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied. New price: " + product.getPrice());
    }
}
