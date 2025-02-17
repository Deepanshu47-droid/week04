package com.reflection.basic.dynamicallycreatedobject;

public class Main {
    public static void main(String[] args) {
        try {
            // Getting the Class object
            Class<?> studentClass = Class.forName("com.reflection.basic.dynamicallycreatedobject.Student");

            // Creating an instance dynamically using newInstance()
            Object studentObject = studentClass.getDeclaredConstructor().newInstance();

            // Invoking method using reflection
            studentClass.getMethod("displayInfo").invoke(studentObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

