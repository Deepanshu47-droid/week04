package com.annotation.customcachingsystem;

public class ExpensiveComputation {

    // Apply @CacheResult annotation to the method
    @CacheResult
    public int computeFactorial(int n) {
        System.out.println("Computing factorial of " + n);
        return factorial(n);
    }

    // Helper method to compute factorial
    private int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

