package com.repaso.martes.service.impl;

import com.repaso.martes.models.Course;
import com.repaso.martes.repositories.CourseRepositories;
import com.repaso.martes.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    private final CourseRepositories courseRepository;
    private final List<Course> courses;

    public CourseServiceImpl(CourseRepositories courseRepository, List<Course> courses) {
        this.courseRepository = courseRepository;
        this.courses = courses;
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public Course findById(Long id) {
        for(Course course : courses){
            if (course.getId().equals(id)){
                return course;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Course course = findById(id);
        if (course != null){
            courses.remove(course);
        }
    }
}
