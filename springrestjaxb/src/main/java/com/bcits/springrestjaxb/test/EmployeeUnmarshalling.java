package com.bcits.springrestjaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.bcits.springrestjaxb.beans.EmployeePrimaryInfo;

public class EmployeeUnmarshalling {

	public static void main(String[] args) {

		JAXBContext jaxbContext;

		try {
			jaxbContext = JAXBContext.newInstance(EmployeePrimaryInfo.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			EmployeePrimaryInfo employeePrimaryInfo = (EmployeePrimaryInfo) unmarshaller
					.unmarshal(new File("employeeInfo2.xml"));
			
			System.out.println("Emp Id = " + employeePrimaryInfo.getEmpId());
			System.out.println("Name = " + employeePrimaryInfo.getEmpName());
//			System.out.println("Salary = " + employeePrimaryInfo.getSalary());
			System.out.println("DOB = " + employeePrimaryInfo.getDob());
			System.out.println("DOJ = " + employeePrimaryInfo.getDoj());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// End of main()

}
