package com.ai.resumescreening;

// Class representing the Product Manager job role
public class ProductManager extends JobRole {
    private String managementSkills;  // Management skills required for this role

    // Constructor to initialize the job title and skills
    public ProductManager(String jobTitle, String managementSkills) {
        super(jobTitle);
        this.managementSkills = managementSkills;
    }

    // Implementing the showRoleDetails method from JobRole
    @Override
    public void showRoleDetails() {
        System.out.println("Product Manager Role - Job Title: " + getJobTitle());
        System.out.println("Required Management Skills: " + managementSkills);
    }
}
