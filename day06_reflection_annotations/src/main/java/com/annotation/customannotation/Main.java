package com.annotation.customannotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create an instance of TaskManager
        TaskManager taskManager = new TaskManager();

        // Get all methods of TaskManager class
        Method[] methods = taskManager.getClass().getDeclaredMethods();

        // Iterate over methods to find annotated methods
        for (Method method : methods) {
            // Check if the method is annotated with @TaskInfo
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Get the @TaskInfo annotation
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                // Print annotation details
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        }
    }
}
