package com.marketplace;

// Class representing the Gadget category
public class GadgetCategory {
    private String brand;

    public GadgetCategory(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "GadgetCategory{brand='" + brand + "'}";
    }
}
