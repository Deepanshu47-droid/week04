package com.ai.resumescreening;

import java.util.List;

public class ResumeUtils {
    // Method to process multiple resumes using wildcards
    // Accepts a list of resumes for any type of job role (List<? extends JobRole>)
    public static void processResumes(List<? extends JobRole> resumes) {
        System.out.println("Processing Resumes...");
        for (JobRole role : resumes) {
            role.showRoleDetails();
            System.out.println("----");
        }
        System.out.println("Resume Processing Completed!\n");
    }
}
