package com.university.coursemanagement;

// Course type that is exam-based
public class ExamCourse extends CourseType {
    private int totalMarks;

    public ExamCourse(String courseName, int durationInWeeks, int totalMarks) {
        super(courseName, durationInWeeks);
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return super.toString() + ", ExamCourse{totalMarks=" + totalMarks + "}";
    }
}
