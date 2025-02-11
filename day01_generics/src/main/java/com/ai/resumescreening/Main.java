package com.ai.resumescreening;

import java.util.List;

public class Main {
    // Main method to demonstrate resume screening
    public static void main(String[] args) {
        // Creating individual job roles
        SoftwareEngineer seRole = new SoftwareEngineer("Backend Developer", "Java, Spring Boot");
        DataScientist dsRole = new DataScientist("Data Analyst", "Python, SQL, Machine Learning");
        ProductManager pmRole = new ProductManager("Project Lead", "Agile, Scrum, Leadership");

        // Creating individual resumes for the job roles
        Resume<SoftwareEngineer> seResume = new Resume<>(seRole);
        Resume<DataScientist> dsResume = new Resume<>(dsRole);
        Resume<ProductManager> pmResume = new Resume<>(pmRole);

        // Displaying details of individual resumes
        System.out.println("Displaying Individual Resumes:");
        seResume.displayJobDetails();
        System.out.println();

        dsResume.displayJobDetails();
        System.out.println();

        pmResume.displayJobDetails();
        System.out.println();

        // Processing multiple resumes in a list using wildcards
        System.out.println("Processing Multiple Resumes:");
        ResumeUtils.processResumes(List.of(seRole, dsRole, pmRole));
    }

}
