package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.bcits.springcoreannotation.beans.DepartmentBean;

public class DepartmentConfig {

	@Bean(name = "dev")
	public DepartmentBean getDeptDev() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(101);
		departmentBean.setDeptName("DEV");
		return departmentBean;
	}// End of getDeptDev()

	@Bean(name = "hr") // @Primary isn't used the @Qualifier("beanName")
	// @Primary // Priority will comes to this method and displayed it in the
	// console.
	public DepartmentBean getDeptHR() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(102);
		departmentBean.setDeptName("HR");
		return departmentBean;

	}// End of getDeptHR()

	@Bean(name = "acc")
	public DepartmentBean getDeptAccount() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(103);
		departmentBean.setDeptName("Manager");
		return departmentBean;

	}// End of getDeptAccount()

}
