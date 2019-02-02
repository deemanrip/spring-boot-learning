package com.yukhlin.spring_boot_learning.controller;

import com.yukhlin.spring_boot_learning.entity.Topic;
import com.yukhlin.spring_boot_learning.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.saveOrUpdateTopic(topic);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic) {
        topicService.saveOrUpdateTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }
}