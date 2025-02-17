package com.reflection.basic.classnformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking class name input
        System.out.print("Enter fully qualified class name (with package path)\n(For example java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {
            // Loading the class dynamically
            Class<?> cls = Class.forName(className);

            // Displaying class name
            System.out.println("\nClass: " + cls.getName());

            // Displaying constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // Displaying fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            // Displaying methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }

        scanner.close();
    }
}
