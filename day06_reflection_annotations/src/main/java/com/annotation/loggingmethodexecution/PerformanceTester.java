package com.annotation.loggingmethodexecution;

public class PerformanceTester {

    @LogExecutionTime
    public void quickMethod() {
        System.out.println("Executing quick method...");
    }

    @LogExecutionTime
    public void slowMethod() {
        System.out.println("Executing slow method...");
        try {
            Thread.sleep(1000); // Simulating a slow process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
