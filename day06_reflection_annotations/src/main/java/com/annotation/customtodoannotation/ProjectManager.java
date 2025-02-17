package com.annotation.customtodoannotation;

public class ProjectManager {

    // Task assigned to Deepanshu with default priority "MEDIUM"
    @Todo(task = "Implement user authentication", assignedTo = "Deepanshu")
    public void implementAuth() {
        System.out.println("Implementing authentication...");
    }

    // Task assigned to Shubham with priority "HIGH"
    @Todo(task = "Optimize database queries", assignedTo = "Shubham", priority = "HIGH")
    public void optimizeDatabase() {
        System.out.println("Optimizing database queries...");
    }

    // Task assigned to Karan with priority "LOW"
    @Todo(task = "Improve UI design", assignedTo = "Karan", priority = "LOW")
    public void improveUI() {
        System.out.println("Improving UI design...");
    }
}
