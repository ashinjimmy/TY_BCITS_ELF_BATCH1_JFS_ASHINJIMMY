package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.beans.EmployeePrimaryInfo;

public class EmployeeJSONMarshalling {
	
	public static void main(String[] args) {
		

	
	 EmployeePrimaryInfo employeePrimaryInfo = new EmployeePrimaryInfo();
	 employeePrimaryInfo.setEmpId(9999);
	 employeePrimaryInfo.setBloodgrp("B+ve");
	 employeePrimaryInfo.setDeptId(11);
	 employeePrimaryInfo.setDesignation("SSD");
	 employeePrimaryInfo.setDob(new Date());
	 employeePrimaryInfo.setDoj(new Date());
	 employeePrimaryInfo.setEmpMobileno(7907170787L);
	 employeePrimaryInfo.setEmpName("Rajdeep");
	 employeePrimaryInfo.setMailId("rajdeep@email.com");
	 employeePrimaryInfo.setManagerId(23);
	 employeePrimaryInfo.setPassword("qwerty");
	 
	 // Marshalling into JSON
	 
	 
	 try {
		ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter();// formated JSON object
		mapper.writeValue(new File("empJson6.json"), employeePrimaryInfo);
		mapper.writeValue(System.out, employeePrimaryInfo);
	} catch (Exception e) {
		e.printStackTrace();
	}
	 

	}
}
