package com.mealplan.genetator;

// Class representing a vegan meal plan
public class VeganMeal implements MealPlan {
    private String smoothie;  // Smoothie for the vegan meal

    // Constructor to initialize the smoothie
    public VeganMeal(String smoothie) {
        this.smoothie = smoothie;
    }

    // Implementing the showMealDetails method from MealPlan interface
    // This method displays details about the vegan meal
    @Override
    public void showMealDetails() {
        System.out.println("Vegan Meal - Smoothie: " + smoothie);
    }
}
