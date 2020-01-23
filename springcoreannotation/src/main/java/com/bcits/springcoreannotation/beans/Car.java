package com.bcits.springcoreannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Car {
	
	private String Company;
	@Autowired
	private Engine engine;

}
