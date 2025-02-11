package com.mealplan.genetator;

// Class representing a vegetarian meal plan
public class VegetarianMeal implements MealPlan {
    private String mainDish;  // Main dish for the vegetarian meal

    // Constructor to initialize the main dish
    public VegetarianMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    // Implementing the showMealDetails method from MealPlan interface
    // This method displays details about the vegetarian meal
    @Override
    public void showMealDetails() {
        System.out.println("Vegetarian Meal - Main Dish: " + mainDish);
    }
}
