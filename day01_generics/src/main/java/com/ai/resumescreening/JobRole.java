package com.ai.resumescreening;

// Abstract class representing a generic job role
public abstract class JobRole {
    private String jobTitle;  // Title of the job role

    // Constructor to initialize the job title
    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Method to get the job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Abstract method to display role-specific details
    public abstract void showRoleDetails();
}
