package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bcits.springcoreannotation.beans.EmployeeBean;

@Configuration
public class EmployeeConfig {
     
	@Bean
	// By default the scope will be singleton
//	@Scope("prototype") // Commented to see the Destruction phase
	public EmployeeBean getEmployeeBean() {
		
		return new EmployeeBean();
		
		//Hard coded values
		/*
		 * EmployeeBean employeeBean = new EmployeeBean();
		 * employeeBean.setName("Prakash"); employeeBean.setAge(16); return
		 * employeeBean;
		 */
		
		
	}//End of getEmployee()

}// End of Class
