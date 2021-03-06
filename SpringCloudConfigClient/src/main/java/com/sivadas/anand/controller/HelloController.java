package com.sivadas.anand.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${greeting.message}")
	String message;
	
	@GetMapping(value="/hi")
	public String sayHello() {
		return message;
	}
	
}
