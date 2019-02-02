package com.yukhlin.spring_boot_learning.service;

import com.yukhlin.spring_boot_learning.entity.Topic;
import com.yukhlin.spring_boot_learning.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TopicService {

    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        Iterable<Topic> topics = topicRepository.findAll();
        return StreamSupport
                .stream(topics.spliterator(), false)
                .collect(Collectors.toList());
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).get();
    }

    public void saveOrUpdateTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }
}