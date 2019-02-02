package com.yukhlin.spring_boot_learning.service;

import com.yukhlin.spring_boot_learning.entity.Course;
import com.yukhlin.spring_boot_learning.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findByTopicId(topicId);
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    public void saveOrUpdateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}