package com.repaso.martes.service;

import com.repaso.martes.models.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    void save(Course course);
    Course findById(Long id);
    void deleteById(Long id);
}
