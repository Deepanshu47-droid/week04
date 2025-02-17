package com.annotation.customcachingsystem;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation computation = new ExpensiveComputation();

        // Get the method reference
        Method computeMethod = ExpensiveComputation.class.getMethod("computeFactorial", int.class);

        // Calling the method first time
        Object result1 = CacheManager.cacheMethodResult(computation, computeMethod, new Object[]{5});
        System.out.println("Result: " + result1); // Expected: Computing factorial of 5, Result: 120

        // Calling the method second time with the same input (should return cached result)
        Object result2 = CacheManager.cacheMethodResult(computation, computeMethod, new Object[]{5});
        System.out.println("Result: " + result2); // Expected: Returning cached result for computeFactorial-5, Result: 120

        // Calling the method with a different input
        Object result3 = CacheManager.cacheMethodResult(computation, computeMethod, new Object[]{6});
        System.out.println("Result: " + result3); // Expected: Computing factorial of 6, Result: 720
    }
}

