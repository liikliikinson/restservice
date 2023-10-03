package com.example.demo;
import java.util.concurrent.atomic.AtomicLong;

 

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

 

// use annotation to configure java class to be a rest controller

@RestController

public class GreetingController {

 

	// instance variables

	private static final String template = "Hello, %s!";

	private final AtomicLong counter = new AtomicLong();

 

	// use annotation to configure method to handle get request

	// method also configured to map to request parameter (if any)

	@GetMapping(path = {"/greeting", "/greet"})

	public Greeting greeting(@RequestParam(name = "name", defaultValue = "World") String name) {

		return new Greeting(counter.incrementAndGet(), String.format(template, name));

	}

}