package com.ai.resumescreening;

// Generic class to represent a resume for a specific job role
// T must extend JobRole, ensuring only valid job roles are processed
public class Resume<T extends JobRole> {
    private T jobRole;  // Job role associated with this resume

    // Constructor to initialize the job role
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    // Method to display details of the associated job role
    public void displayJobDetails() {
        jobRole.showRoleDetails();
    }
}
