package com.ai.resumescreening;

// Class representing the Software Engineer job role
public class SoftwareEngineer extends JobRole {
    private String programmingLanguages;  // Programming languages required for this role

    // Constructor to initialize the job title and programming languages
    public SoftwareEngineer(String jobTitle, String programmingLanguages) {
        super(jobTitle);
        this.programmingLanguages = programmingLanguages;
    }

    // Implementing the showRoleDetails method from JobRole
    @Override
    public void showRoleDetails() {
        System.out.println("Software Engineer Role - Job Title: " + getJobTitle());
        System.out.println("Required Programming Languages: " + programmingLanguages);
    }
}
