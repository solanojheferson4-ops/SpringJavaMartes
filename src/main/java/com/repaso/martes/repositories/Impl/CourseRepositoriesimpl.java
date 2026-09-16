package com.repaso.martes.repositories.Impl;

import com.repaso.martes.models.Course;
import com.repaso.martes.repositories.CourseRepositories;

import java.util.List;

public class CourseRepositoriesimpl implements CourseRepositories {

    private final List<Course> course;

    public CourseRepositoriesimpl(List<Course> course) {
        this.course = course;
    }

    @Override
    public void save(Course course) {
        course.add(course);
    }

    @Override
    public Course findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Course course) {

    }

    @Override
    public List<Course> findAll() {
        return course;
    }
}
