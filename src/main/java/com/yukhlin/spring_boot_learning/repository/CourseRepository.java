package com.yukhlin.spring_boot_learning.repository;

import com.yukhlin.spring_boot_learning.entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    List<Course> findByTopicId(String topicId);
}