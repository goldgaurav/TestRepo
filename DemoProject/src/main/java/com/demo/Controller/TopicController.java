package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @Autowired
	TopicService topicService = null;
	
    @RequestMapping("/Topics")
	public List<Topic> getTopics(){
    	System.out.println("here1");
		return topicService.getTopics();
	}
    
    @RequestMapping("/Topics/{id}")
   	public Topic getTopic(@PathVariable String id){
   		return topicService.getTopic(id);
   	}
    
    @RequestMapping(method = RequestMethod.POST,value = "/Topics")
   	public void addTopic(@RequestBody Topic topic){
   		topicService.addTopic(topic);
   	}
    
    @RequestMapping(method = RequestMethod.PUT,value = "/Topics")
   	public void updateTopic(@RequestBody Topic topic){
   		topicService.updateTopic(topic);
   	}
    
    @RequestMapping(method = RequestMethod.DELETE,value = "/Topics/{id}")
   	public void deleteTopic(@PathVariable String id){
   		topicService.deleteTopic(id);
   	}
}
