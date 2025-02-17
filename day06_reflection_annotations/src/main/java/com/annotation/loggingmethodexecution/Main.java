package com.annotation.loggingmethodexecution;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        PerformanceTester tester = new PerformanceTester();
        Method[] methods = PerformanceTester.class.getDeclaredMethods();

        // Looping through all methods in PerformanceTester
        for (Method method : methods) {
            // Checking if the method is annotated with @LogExecutionTime
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime(); // Start time
                method.invoke(tester);
                long endTime = System.nanoTime(); // End time

                // Calculating and print execution time in milliseconds
                long duration = (endTime - startTime) / 1_000_000;
                System.out.println("Execution time of " + method.getName() + ": " + duration + " ms");
                System.out.println("-------------------------");
            }
        }
    }
}
