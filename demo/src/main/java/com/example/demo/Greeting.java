package com.example.demo;

public class Greeting {
	//instance
	private final long id;
	private final String content;
	
	//constructor
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	//public methods setter/getter
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
