package com.skill.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	

	@GetMapping("/")
	public String sayHelloone() {

		return "Welcome to Spring-MVC app message 1";
	}
	@GetMapping("/hello")
	public String sayHellotwo() {

		return "Welcome to Spring-MVC app message 2!!";
	}
	@GetMapping("/welcome")
	public String sayHellothree() {

		return "Welcome to Spring-MVC app..Last Message!!";
	}
}
