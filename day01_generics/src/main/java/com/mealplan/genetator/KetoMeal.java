package com.mealplan.genetator;

// Class representing a keto meal plan
public class KetoMeal implements MealPlan {
    private String proteinSource;  // Protein source for the keto meal

    // Constructor to initialize the protein source
    public KetoMeal(String proteinSource) {
        this.proteinSource = proteinSource;
    }

    // Implementing the showMealDetails method from MealPlan interface
    // This method displays details about the keto meal
    @Override
    public void showMealDetails() {
        System.out.println("Keto Meal - Protein Source: " + proteinSource);
    }
}
