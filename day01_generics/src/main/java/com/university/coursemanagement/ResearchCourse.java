package com.university.coursemanagement;

// Course type that is research-based
public class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, int durationInWeeks, String researchTopic) {
        super(courseName, durationInWeeks);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", ResearchCourse{researchTopic='" + researchTopic + "'}";
    }
}
