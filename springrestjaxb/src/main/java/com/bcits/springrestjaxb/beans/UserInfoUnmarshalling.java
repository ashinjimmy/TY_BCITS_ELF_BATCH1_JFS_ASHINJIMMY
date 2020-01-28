package com.bcits.springrestjaxb.beans;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UserInfoUnmarshalling {

	public static void main(String[] args) {

		JAXBContext jaxbContext;

		try {
			jaxbContext = JAXBContext.newInstance(UserInfoBean.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			UserInfoBean userInfoBean = (UserInfoBean) unmarshaller.unmarshal(new File("userInfo2.xml"));

			System.out.println("Name = " + userInfoBean.getEmpName());
//		System.out.println("Salary = " + employeePrimaryInfo.getSalary());
			System.out.println("Aadhar Number = " + userInfoBean.getUserOtherInfoBean().getAdharNumber());
			/* System.out.println("DOJ = " + userInfoBean.getDoj()); */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
