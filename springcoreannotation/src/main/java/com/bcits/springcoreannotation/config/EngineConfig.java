package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springcoreannotation.beans.Engine;

@Configuration
public class EngineConfig {

	@Bean
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setCc(2300);
		engine.setType("Diesel");
		return engine;

	}// End of getEngine()

}// End of class
