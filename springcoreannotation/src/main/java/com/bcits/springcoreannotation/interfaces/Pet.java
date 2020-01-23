package com.bcits.springcoreannotation.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Pet {
	
	private String name;
	
	@Autowired
	private Animal animal;

}//End of class
