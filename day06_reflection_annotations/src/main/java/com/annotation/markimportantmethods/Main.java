package com.annotation.markimportantmethods;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Getting all methods of TaskManager class
        Method[] methods = TaskManager.class.getDeclaredMethods();

        // Looping through each method
        for (Method method : methods) {
            // Checking if method is annotated with @ImportantMethod
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                // Retrieving the annotation
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

                // Printing method name and importance level
                System.out.println("Important Method: " + method.getName());
                System.out.println("Importance Level: " + annotation.level());
                System.out.println("----------------------");
            }
        }
    }
}
