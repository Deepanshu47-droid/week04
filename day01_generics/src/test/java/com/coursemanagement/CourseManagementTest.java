package com.coursemanagement;

import com.university.coursemanagement.AssignmentCourse;
import com.university.coursemanagement.Course;
import com.university.coursemanagement.ExamCourse;
import com.university.coursemanagement.ResearchCourse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CourseManagementTest {

    @Test
    void testAddCourse() {
        // Creating a Course manager for ExamCourse
        Course<ExamCourse> examCourseManager = new Course<>();
        ExamCourse examCourse = new ExamCourse("Mathematics", 12, 100);

        // Adding the course to the manager
        examCourseManager.addCourse(examCourse);

        // Verifying that the course was added
        List<ExamCourse> courses = examCourseManager.getCourses();
        assertEquals(1, courses.size());
        assertEquals("Mathematics", courses.get(0).getCourseName());
        assertEquals(100, courses.get(0).getTotalMarks());
    }

    @Test
    void testDisplayCourses() {
        // Creating a Course manager and adding multiple courses
        Course<AssignmentCourse> assignmentCourseManager = new Course<>();
        assignmentCourseManager.addCourse(new AssignmentCourse("Data Structures", 10, 5));
        assignmentCourseManager.addCourse(new AssignmentCourse("Algorithms", 8, 4));

        // Verifying that the courses are added correctly
        List<AssignmentCourse> courses = assignmentCourseManager.getCourses();
        assertEquals(2, courses.size());
        assertEquals("Data Structures", courses.get(0).getCourseName());
        assertEquals(5, courses.get(0).getNumberOfAssignments());
    }

    @Test
    void testResearchCourseAttributes() {
        // Creating a ResearchCourse and verifying its attributes
        ResearchCourse researchCourse = new ResearchCourse("Artificial Intelligence", 16, "Machine Learning");

        assertEquals("Artificial Intelligence", researchCourse.getCourseName());
        assertEquals(16, researchCourse.getDurationInWeeks());
        assertEquals("Machine Learning", researchCourse.getResearchTopic());
    }

    @Test
    void testToStringMethod() {
        // Creating an ExamCourse and checking the toString output
        ExamCourse examCourse = new ExamCourse("Physics", 14, 200);
        String expected = "CourseType{courseName='Physics', durationInWeeks=14}, ExamCourse{totalMarks=200}";

        assertEquals(expected, examCourse.toString());
    }
}
