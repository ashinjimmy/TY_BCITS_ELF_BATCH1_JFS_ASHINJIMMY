package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.bcits.springcoreannotation.beans.DepartmentBean;
import com.bcits.springcoreannotation.beans.EmployeeBean;

@Import(DepartmentConfig.class)//should import if required is used inside @Autowire()
@Configuration
public class EmployeeConfig2 {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setName("Abhi");
		employeeBean.setAge(22);

		// @Autowired is used so no need of manual wiring
//		employeeBean.setDepartmentBean(getDepartmentBean()); //Wiring manually

		return employeeBean;
	}// End of getEmployee()

	
}// End of class
