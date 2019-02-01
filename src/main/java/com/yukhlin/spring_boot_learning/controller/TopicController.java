package com.yukhlin.spring_boot_learning.controller;

import com.yukhlin.spring_boot_learning.model.Topic;
import com.yukhlin.spring_boot_learning.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }
}