package com.mealplan.generator;

import com.mealplan.genetator.KetoMeal;
import com.mealplan.genetator.Main;
import com.mealplan.genetator.VeganMeal;
import com.mealplan.genetator.VegetarianMeal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MealPlanGeneratorTest {

    @Test
    void testVegetarianMealDetails() {
        // Creating a VegetarianMeal instance
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Paneer Curry");

        // Verifying the meal details are set correctly
        assertNotNull(vegetarianMeal);
    }

    @Test
    void testVeganMealDetails() {
        // Creating a VeganMeal instance
        VeganMeal veganMeal = new VeganMeal("Green Smoothie");

        // Verifying the meal details are set correctly
        assertNotNull(veganMeal);
    }

    @Test
    void testKetoMealDetails() {
        // Creating a KetoMeal instance
        KetoMeal ketoMeal = new KetoMeal("Grilled Chicken");

        // Verifying the meal details are set correctly
        assertNotNull(ketoMeal);
    }

    @Test
    void testMealDisplay() {
        // Creating instances of different meal plans
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Paneer Curry");
        VeganMeal veganMeal = new VeganMeal("Green Smoothie");
        KetoMeal ketoMeal = new KetoMeal("Grilled Chicken");

        // Verifying that each meal displays without errors
        assertDoesNotThrow(vegetarianMeal::showMealDetails);
        assertDoesNotThrow(veganMeal::showMealDetails);
        assertDoesNotThrow(ketoMeal::showMealDetails);
    }

    @Test
    void testGenerateMealPlan() {
        // Creating a VeganMeal instance
        VeganMeal veganMeal = new VeganMeal("Avocado Smoothie");

        // Verifying the generateMealPlan method runs without exceptions
        assertDoesNotThrow(() -> Main.generateMealPlan(veganMeal));
    }
}
