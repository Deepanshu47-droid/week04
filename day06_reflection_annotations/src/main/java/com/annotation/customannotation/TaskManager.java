package com.annotation.customannotation;

public class TaskManager {

    // Apply the custom annotation @TaskInfo
    @TaskInfo(priority = "High", assignedTo = "John Doe")
    public void completeTask() {
        System.out.println("Task completed.");
    }

    // Another method without annotation
    public void noAnnotationTask() {
        System.out.println("Task without annotation.");
    }
}
