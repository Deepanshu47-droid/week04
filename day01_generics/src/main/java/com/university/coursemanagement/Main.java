package com.university.coursemanagement;

public class Main {
    public static void main(String[] args) {
        // Create instances of different course types
        ExamCourse examCourse = new ExamCourse("Mathematics", 12, 100);
        AssignmentCourse assignmentCourse = new AssignmentCourse("Data Structures", 10, 5);
        ResearchCourse researchCourse = new ResearchCourse("Artificial Intelligence", 16, "Machine Learning");

        // Create a Course manager for exam-based courses
        Course<ExamCourse> examCourseManager = new Course<>();
        examCourseManager.addCourse(examCourse);

        // Create a Course manager for assignment-based courses
        Course<AssignmentCourse> assignmentCourseManager = new Course<>();
        assignmentCourseManager.addCourse(assignmentCourse);

        // Create a Course manager for research-based courses
        Course<ResearchCourse> researchCourseManager = new Course<>();
        researchCourseManager.addCourse(researchCourse);

        // Display all courses
        System.out.println("Exam Courses:");
        examCourseManager.displayCourses();

        System.out.println("\nAssignment Courses:");
        assignmentCourseManager.displayCourses();

        System.out.println("\nResearch Courses:");
        researchCourseManager.displayCourses();
    }
}
