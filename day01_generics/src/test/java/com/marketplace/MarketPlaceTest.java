package com.marketplace;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MarketplaceTest {

    @Test
    void testAddProduct() {
        // Creating a product with BookCategory
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Technology"));

        // Checking that product attributes are set correctly
        assertEquals("Java Programming", book.getName());
        assertEquals(500, book.getPrice());
        assertEquals("Technology", book.getCategory().getGenre());
    }

    @Test
    void testApplyDiscount() {
        // Creating a product with GadgetCategory
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 20000, new GadgetCategory("Samsung"));

        // Applying a 10% discount
        MarketplaceUtils.applyDiscount(gadget, 10);

        // Verifying that the price is reduced by 10%
        assertEquals(18000, gadget.getPrice());
    }

    @Test
    void testInvalidDiscount() {
        // Creating a product with ClothingCategory
        Product<ClothingCategory> clothing = new Product<>("T-shirt", 300, new ClothingCategory("Medium"));

        // Applying an invalid discount (-10%) which should not change the price
        MarketplaceUtils.applyDiscount(clothing, -10);

        // Verifying that the price remains unchanged
        assertEquals(300, clothing.getPrice());
    }

    @Test
    void testToStringMethod() {
        // Creating a product with BookCategory
        Product<BookCategory> book = new Product<>("Clean Code", 600, new BookCategory("Programming"));

        // Verifying that the toString method returns the expected string
        String expected = "Product{name='Clean Code', price=600.0, category=BookCategory{genre='Programming'}}";
        assertEquals(expected, book.toString());
    }
}
