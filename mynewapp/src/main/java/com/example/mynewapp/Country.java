package com.example.mynewapp;

public class Country {
	private String name;
	private String cases;
	public Country()
	{
		
	}
	public Country(String name, String cases) {
		super();
		this.name = name;
		this.cases = cases;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCases() {
		return cases;
	}
	public void setCases(String cases) {
		this.cases = cases;
	}
	
}
