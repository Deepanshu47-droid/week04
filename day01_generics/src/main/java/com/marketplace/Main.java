package com.marketplace;

public class Main {
    public static void main(String[] args) {
        // Creating product instances with different categories
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Technology"));
        Product<ClothingCategory> clothing = new Product<>("T-shirt", 300, new ClothingCategory("Medium"));
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 20000, new GadgetCategory("Samsung"));

        // Displaying product details
        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);

        // Applying discounts
        System.out.println("\nApplying Discounts:");
        MarketplaceUtils.applyDiscount(book, 10);   // 10% discount on book
        MarketplaceUtils.applyDiscount(clothing, 20); // 20% discount on clothing
        MarketplaceUtils.applyDiscount(gadget, 5);  // 5% discount on gadget

        // Displaying product details after discount
        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);
    }
}
