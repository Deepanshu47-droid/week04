package com.reflection.advanced.methodexecutiontime;

// Defining a class with methods to measure execution time
public class TaskProcessor {
    public void longRunningTask() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
