package com.bcits.springcoreannotation.interfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(AnimalConfig.class)
@Configuration
public class PetConfig {

	@Bean
	public Pet getPet() {
		Pet myPet = new Pet();
		myPet.setName("Jacky");
		
		return myPet;
	}//End of getPet()
}//End of Class
