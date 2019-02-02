package com.yukhlin.spring_boot_learning.service;

import com.yukhlin.spring_boot_learning.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>();

    public TopicService() {
        topics.add(new Topic("spring", "Spring Framework", "Spring Framework Description"));
        topics.add(new Topic("springboot", "SpringBoot Framework", "SpringBoot Framework Description"));
        topics.add(new Topic("java", "Java Core", "Java Core Description"));
        topics.add(new Topic("javascript", "JavaScript", "JavaScript Description"));
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}