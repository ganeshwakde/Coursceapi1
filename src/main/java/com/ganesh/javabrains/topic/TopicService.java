package com.ganesh.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics= new ArrayList<>(  Arrays.asList(
			
			new Topic(1, "Python","Pytoh Lang" ),
			new Topic(2, "Ruby","Ruby Lang" ),
			new Topic(3, "Java","Java Lang" )
			));

	public List<Topic> getAllTopics() {
		return topics;
	}
			
			
	public Topic getTopic(int id) {
		return topics.stream().filter(t-> t.getId()==id).findFirst().get();
		
		
	}


	public void addtopics(Topic topic) {
		
		topics.add(topic);
		
	}
	
			
	
}
