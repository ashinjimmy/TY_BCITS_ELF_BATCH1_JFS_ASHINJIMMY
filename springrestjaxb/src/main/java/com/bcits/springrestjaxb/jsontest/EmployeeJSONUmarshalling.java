package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.beans.EmployeePrimaryInfo;

public class EmployeeJSONUmarshalling {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();
		EmployeePrimaryInfo employeePrimaryInfo;
		try {
			employeePrimaryInfo = objectMapper.readValue(new File("empJson2.json"), EmployeePrimaryInfo.class);
			System.out.println("ID = " + employeePrimaryInfo.getEmpId());
			System.out.println("Name = " + employeePrimaryInfo.getEmpName());
			System.out.println(" DOB = " + employeePrimaryInfo.getDob());
			System.out.println("DOJ  = " + employeePrimaryInfo.getDoj());

		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
