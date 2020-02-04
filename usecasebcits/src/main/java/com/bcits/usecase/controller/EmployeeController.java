package com.bcits.usecase.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.bcits.usecase.service.EmployeeService;

  
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService  service;

	@GetMapping("/employeeLoginPage")
	public String displayEmpLogin() {
		return "employeeLogin";
	}
	
	@GetMapping("/employeeHomePage")
	public String displayConsumerLoginPage() {
		return "employeeHome";
	}

}