package com.bcits.springrestjaxb.test;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.bcits.springrestjaxb.beans.EmployeePrimaryInfo;

public class EmployeeMarshallingTest {

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
		// employeePrimaryInfo.setSalary(30000);

		try {
			JAXBContext context = JAXBContext.newInstance(EmployeePrimaryInfo.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// For Formatted XML
			marshaller.marshal(employeePrimaryInfo, System.out);
			marshaller.marshal(employeePrimaryInfo, new File("employeeInfo.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unable");
		}
	}// End of main()

}// End of class
