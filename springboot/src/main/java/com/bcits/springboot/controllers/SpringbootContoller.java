package com.bcits.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootContoller {

	@GetMapping("/")
	public String getMessage() {
		return "hello World!";
	}

}
