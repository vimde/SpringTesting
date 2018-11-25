package com.spring.unit.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {

	@GetMapping("/hello-spring")
	public String sayHelloSpring() {
		return "Hello Spring";
	}
}
