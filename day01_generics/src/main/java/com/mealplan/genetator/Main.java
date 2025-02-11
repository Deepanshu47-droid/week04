package com.mealplan.genetator;

// Main class to generate and manage personalized meal plans
public class Main {

    // Generic method to generate a meal plan
    // T must extend MealPlan, ensuring only valid meal types can be passed
    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {
        System.out.println("Generating Meal Plan...");
        mealPlan.showMealDetails();  // Display the meal details
        System.out.println("Meal Plan Generated Successfully!\n");
    }

    // Main method to demonstrate meal plan generation and display
    public static void main(String[] args) {
        // Creating instances of different meal plans
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Paneer Curry");
        VeganMeal veganMeal = new VeganMeal("Green Smoothie");
        KetoMeal ketoMeal = new KetoMeal("Grilled Chicken");

        // Generating meal plans using the generic method
        generateMealPlan(vegetarianMeal);
        generateMealPlan(veganMeal);
        generateMealPlan(ketoMeal);

        // Using the generic class Meal<T> to display each meal plan
        System.out.println("Displaying Meal Plans:");
        Meal<VegetarianMeal> vegMeal = new Meal<>(vegetarianMeal);
        vegMeal.displayMeal();

        Meal<VeganMeal> vegan = new Meal<>(veganMeal);
        vegan.displayMeal();

        Meal<KetoMeal> keto = new Meal<>(ketoMeal);
        keto.displayMeal();
    }
}
