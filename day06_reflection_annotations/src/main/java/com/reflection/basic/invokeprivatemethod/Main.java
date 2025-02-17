package com.reflection.basic.invokeprivatemethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating an instance of Calculator
            Calculator calculator = new Calculator();

            // Getting the Class object
            Class<?> calculatorClass = calculator.getClass();

            // Accessing the private method 'multiply'
            Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);

            // Making the private method accessible
            multiplyMethod.setAccessible(true);

            // Invoking the private method
            int result = (int) multiplyMethod.invoke(calculator, 5, 6);

            // Displaying the result
            System.out.println("Result of multiplication: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
