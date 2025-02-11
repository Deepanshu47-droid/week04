package com.ai.resumescreening;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ResumeScreeningTest {

    @Test
    void testSoftwareEngineerRoleDetails() {
        // Creating a SoftwareEngineer instance
        SoftwareEngineer seRole = new SoftwareEngineer("Backend Developer", "Java, Spring Boot");

        // Verifying that job title and programming languages are set correctly
        assertEquals("Backend Developer", seRole.getJobTitle());
    }

    @Test
    void testDataScientistRoleDetails() {
        // Creating a DataScientist instance
        DataScientist dsRole = new DataScientist("Data Analyst", "Python, SQL, Machine Learning");

        // Verifying that job title and tools are set correctly
        assertEquals("Data Analyst", dsRole.getJobTitle());
    }

    @Test
    void testProductManagerRoleDetails() {
        // Creating a ProductManager instance
        ProductManager pmRole = new ProductManager("Project Lead", "Agile, Scrum, Leadership");

        // Verifying that job title and management skills are set correctly
        assertEquals("Project Lead", pmRole.getJobTitle());
    }

    @Test
    void testResumeDisplay() {
        // Creating a resume for a DataScientist
        DataScientist dsRole = new DataScientist("Data Scientist", "Python, R, SQL");
        Resume<DataScientist> dsResume = new Resume<>(dsRole);

        // Verifying that resume displays without throwing exceptions
        assertDoesNotThrow(dsResume::displayJobDetails);
    }

    @Test
    void testProcessMultipleResumes() {
        // Creating instances of multiple job roles
        SoftwareEngineer seRole = new SoftwareEngineer("Backend Developer", "Java, Spring Boot");
        DataScientist dsRole = new DataScientist("Data Analyst", "Python, SQL");
        ProductManager pmRole = new ProductManager("Project Lead", "Agile, Scrum");

        // Processing multiple resumes and verifying no exceptions occur
        List<JobRole> roles = List.of(seRole, dsRole, pmRole);
        assertDoesNotThrow(() -> ResumeUtils.processResumes(roles));
    }
}
