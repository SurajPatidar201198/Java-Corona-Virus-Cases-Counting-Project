package com.example.mynewapp;

public class Movies {
	
	private String id;
	private String title;
	private String description;
	
	//generate constructor
	public Movies()
	{
		
	}
	public Movies(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	//generate getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
	
}
