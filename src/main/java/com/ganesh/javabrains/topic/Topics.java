package com.ganesh.javabrains.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topics {

	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")   //http://localhost:8082/topics
	public List<Topic> getTopics() {
		
		return topicservice.getAllTopics(); 	

	}

	@RequestMapping("/topic/{id}")
	public Topic gettopic(@PathVariable  int id) {
		
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addtopic(@RequestBody Topic topic) {
		
		topicservice.addtopics(topic);
		
	}
	
	

}
