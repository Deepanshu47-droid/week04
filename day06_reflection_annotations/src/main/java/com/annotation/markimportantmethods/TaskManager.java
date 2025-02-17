package com.annotation.markimportantmethods;
public class TaskManager {

    // Marking this method as important with default level "HIGH"
    @ImportantMethod
    public void processCriticalTask() {
        System.out.println("Processing critical task...");
    }

    // Marking this method as important with level "MEDIUM"
    @ImportantMethod(level = "MEDIUM")
    public void processRegularTask() {
        System.out.println("Processing regular task...");
    }

    // Normal method without annotation
    public void processMinorTask() {
        System.out.println("Processing minor task...");
    }
}
