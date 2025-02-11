package com.mealplan.genetator;

// Generic class to manage different types of meal plans
// T must extend MealPlan, ensuring only valid meal types are used
public class Meal<T extends MealPlan> {
    private T mealPlan;  // Meal plan of a specific type

    // Constructor to initialize the meal plan
    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    // Method to display the details of the stored meal plan
    public void displayMeal() {
        mealPlan.showMealDetails();
    }
}
