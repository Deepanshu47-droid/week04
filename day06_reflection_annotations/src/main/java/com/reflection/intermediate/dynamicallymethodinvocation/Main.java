package com.reflection.intermediate.dynamicallymethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            // Asking user for method name and inputs
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = input.next();
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            // Getting the MathOperations class
            Class<?> mathClass = Class.forName("com.reflection.intermediate.dynamicallymethodinvocation.MathOperations");

            // Creating an instance of MathOperations dynamically
            Object mathObject = mathClass.getDeclaredConstructor().newInstance();

            // Getting the method dynamically
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoking the method
            Object result = method.invoke(mathObject, num1, num2);

            // Displaying result
            System.out.println("Result: " + result);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
