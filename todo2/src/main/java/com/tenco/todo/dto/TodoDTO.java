package com.tenco.todo.dto;

import java.sql.Timestamp;

public class TodoDTO {

	private int id;
	private String title;
	private String description;
	private int priority;
	private int completed;
	private int fkcategory;
	private Timestamp createdAt;
	
	public TodoDTO(int id, String title, String description, int priority, int completed,Timestamp createdAt, int fkcategory) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = completed;
		this.fkcategory = fkcategory;
		this.createdAt = createdAt;
	}
public TodoDTO() {
	
}

	public TodoDTO(String title, String description, int priority, int completed) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = completed;	
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getCompleted() {
		return completed;
	}
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getFkcategory() {
		return fkcategory;
	}

	public void setFkcategory(int fkcategory) {
		this.fkcategory = fkcategory;
	}
	
}
