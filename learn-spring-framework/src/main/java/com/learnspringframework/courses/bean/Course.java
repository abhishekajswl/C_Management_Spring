package com.learnspringframework.courses.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Course {
	
	public Course() {
		
	}
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String author;
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	

}
