package com.repaso.martes.repositories;

import com.repaso.martes.models.Course;

import java.util.List;

public interface CourseRepositories {
    void save(Course course);
    Course findById(Long id);
    void  deleteById(Course course);
    List<Course> findAll();
}
