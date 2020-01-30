package com.bcits.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class EntityManagerFactoryConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEntityManager() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("springPersistenceUnit");
		return factoryBean;
	}// End of getEntityManager()

}
