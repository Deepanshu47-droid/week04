package com.university.coursemanagement;

// Course type that is assignment-based
public class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(String courseName, int durationInWeeks, int numberOfAssignments) {
        super(courseName, durationInWeeks);
        this.numberOfAssignments = numberOfAssignments;
    }

    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }

    public void setNumberOfAssignments(int numberOfAssignments) {
        this.numberOfAssignments = numberOfAssignments;
    }

    @Override
    public String toString() {
        return super.toString() + ", AssignmentCourse{numberOfAssignments=" + numberOfAssignments + "}";
    }
}
