package com.reflection.intermediate.accessstaticfields;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Getting the Class object
            Class<Configuration> configClass = Configuration.class;

            // Accessing the private static field
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Making the field accessible
            apiKeyField.setAccessible(true);

            // Modifying the static field value
            apiKeyField.set(null, "NEW_API_KEY");

            // Printing the modified value
            System.out.println("Updated API_KEY: " + Configuration.getApiKey());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

