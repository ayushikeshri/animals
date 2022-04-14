package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("Ravi")
	String name;
	@Value("88")
	int id;
	@Autowired
	Course course;
	public Student() {
		super();
	}
	
	
	public Student(String name, int id, Course course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + "]";
	}


	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	
	
	

}
