package com.avx.spring.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String name;
	private String code;
	private String description;
	
	
	public Topic() {
		
	}
	
	
	public Topic(String name, String code, String description) {
		super();
		this.name = name;
		this.code = code;
		this.description = description;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
   
	
	

	

}
