package com.university.coursemanagement;

// Abstract class representing a general course type
public abstract class CourseType {
    private String courseName;
    private int durationInWeeks;

    public CourseType(String courseName, int durationInWeeks) {
        this.courseName = courseName;
        this.durationInWeeks = durationInWeeks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    @Override
    public String toString() {
        return "CourseType{courseName='" + courseName + "', durationInWeeks=" + durationInWeeks + '}';
    }
}
