package com.annotation.customtodoannotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Getting all methods of ProjectManager class
        Method[] methods = ProjectManager.class.getDeclaredMethods();

        // Looping through each method
        for (Method method : methods) {
            // Checking if the method is annotated with @Todo
            if (method.isAnnotationPresent(Todo.class)) {
                // Retrieving the annotation
                Todo annotation = method.getAnnotation(Todo.class);

                // Printing pending task details
                System.out.println("Pending Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("----------------------");
            }
        }
    }
}
