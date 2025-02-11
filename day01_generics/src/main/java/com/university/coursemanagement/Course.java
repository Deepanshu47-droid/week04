package com.university.coursemanagement;

import java.util.ArrayList;
import java.util.List;

// Generic class to manage different types of courses
public class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    // Add a course to the list
    public void addCourse(T course) {
        courseList.add(course);
    }

    // Getter method to retrieve the list of courses
    public List<T> getCourses() {
        return courseList;
    }

    // Display all courses
    public void displayCourses() {
        System.out.println("Courses in the system:");
        for (T course : courseList) {
            System.out.println(course);
        }
    }
}
