package com.avx.spring.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TopicService {
	
	@Autowired
	private  TopicRepository topicRepository;
	 
	
//	private static List<Topic> topics = new ArrayList<>(Arrays.asList(
//			
//			new Topic("Spring","Spring Framework","Helps to understand Spring and Maven"),
//			new Topic("Java","Java Collections","Helps to understand Java Collections"),
//			new Topic("Dockers and Containers","D n C","Helps to understand the concepts of Dockers and Containers"),
//			new Topic("Kubernetes","K8s","Helps to understand Kubernetes and related topics")
//			
//			
//			));
	
	public  List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
		
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public  Topic getTopic(String id) {
		//return topics.stream().filter(t->t.getName().equals(id)).findFirst().get();
		
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		
		topicRepository.save(topic);
		
	}

	public void UpdateTopic(String id, Topic topic) {
		
//		for(int i=0;i<topics.size();i++) {
//			
//			Topic t = topics.get(i);
//			
//			if(t.getName().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		topicRepository.save(topic);
		
	}

	public void DeleteTopic(String id) {
		
		//topics.removeIf(t-> t.getName().equals(id));
		
		topicRepository.deleteById(id);
		
	}

}
