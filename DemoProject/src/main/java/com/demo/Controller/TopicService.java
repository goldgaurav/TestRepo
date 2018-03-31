package com.demo.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1","Spring","Spring Desc"),
			new Topic("2","Hibernate","Hibernate Desc"),
			new Topic("3","Java","Java Desc")			
			));			
		
	public List<Topic> getTopics() {		
		return topics;
	}

	public Topic getTopic(String id) {	
		for(Topic topic:topics)
		{
			if(topic.getId().equals(id))
				return topic;			
		}	
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);		
	}

	public void updateTopic(Topic topic) {
		
				topics.set(Integer.valueOf(topic.getId())-1,topic);
				
	}

	public void deleteTopic(String id) {
	
				topics.remove(Integer.valueOf(id)-1);
				
	}

	
}
