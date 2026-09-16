package com.repaso.martes.models;

public class Course {
    private String courseName;
    private String courseCode;
    private String courseDescription;

    public Course(String courseName, String courseCode, String courseDescription) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public void add(Course course) {
        course.add(course);
    }

    public Object getId() {
        return null;
    }
}
