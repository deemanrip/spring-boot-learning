package com.yukhlin.spring_boot_learning.repository;

import com.yukhlin.spring_boot_learning.entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}