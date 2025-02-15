package com.junittesting.basic.performancetesting;

public class TaskProcessor {

    // Method that simulates a long-running task (3 seconds delay)
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // 3 seconds delay
        return "Task Completed";
    }
}
