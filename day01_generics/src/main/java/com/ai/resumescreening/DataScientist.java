package com.ai.resumescreening;

// Class representing the Data Scientist job role
public class DataScientist extends JobRole {
    private String toolsAndTechniques;  // Tools and techniques required for this role

    // Constructor to initialize the job title and tools
    public DataScientist(String jobTitle, String toolsAndTechniques) {
        super(jobTitle);
        this.toolsAndTechniques = toolsAndTechniques;
    }

    // Implementing the showRoleDetails method from JobRole
    @Override
    public void showRoleDetails() {
        System.out.println("Data Scientist Role - Job Title: " + getJobTitle());
        System.out.println("Required Tools and Techniques: " + toolsAndTechniques);
    }
}
