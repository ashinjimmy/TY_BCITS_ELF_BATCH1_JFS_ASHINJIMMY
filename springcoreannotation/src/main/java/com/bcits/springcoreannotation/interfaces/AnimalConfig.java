package com.bcits.springcoreannotation.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnimalConfig {

	@Bean
	@Primary
	public Goat getAnimal() {
		return new Goat();
	}

	@Bean

	public Elephant getElephant() {
		return new Elephant();
	}// End of getElephant()

}// End of class
