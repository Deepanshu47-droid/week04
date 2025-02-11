package com.marketplace;

// Class representing the Clothing category
public class ClothingCategory {
    private String size;

    public ClothingCategory(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ClothingCategory{size='" + size + "'}";
    }
}
