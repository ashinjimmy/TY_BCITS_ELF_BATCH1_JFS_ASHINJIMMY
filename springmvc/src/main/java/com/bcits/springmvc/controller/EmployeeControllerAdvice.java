package com.bcits.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bcits.springmvc.exceptionhandler.EmployeeException;

@ControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeException.class)//Here ModelMap is not possible istead of it HttpServletRequest
	public String handleEmployeeExcepytion(EmployeeException employeeException, HttpServletRequest req) {
		String errMsg = employeeException.getMessage();
		
		req.setAttribute("errMsg", errMsg);
		return "errorPaage";
	}
}
 