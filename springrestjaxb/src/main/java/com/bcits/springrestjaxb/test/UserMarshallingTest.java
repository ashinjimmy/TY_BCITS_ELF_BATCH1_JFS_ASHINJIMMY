package com.bcits.springrestjaxb.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.bcits.springrestjaxb.beans.UserAddressBean;
import com.bcits.springrestjaxb.beans.UserInfoBean;
import com.bcits.springrestjaxb.beans.UserOtherInfoBean;

public class UserMarshallingTest {

	public static void main(String[] args) {

		UserInfoBean userInfo = new UserInfoBean();
		userInfo.setEmpId(9999);
		userInfo.setBloodgrp("B+ve");
		userInfo.setDeptId(11);
		userInfo.setDesignation("SSD");
		userInfo.setDob(new Date());
		userInfo.setDoj(new Date());
		userInfo.setEmpMobileno(7907170787L);
		userInfo.setEmpName("Rajdeep");
		userInfo.setMailId("rajdeep@email.com");
		userInfo.setManagerId(23);
		userInfo.setPassword("qwerty");
//		 employeePrimaryInfo.setSalary(50000);

		UserOtherInfoBean userOtherInfoBean = new UserOtherInfoBean();
		userOtherInfoBean.setGender("male");
		userOtherInfoBean.setAdharNumber(123456789L);

		userInfo.setUserOtherInfoBean(userOtherInfoBean);
		
		
		UserAddressBean TempAddressInfo = new UserAddressBean();
		TempAddressInfo.setHouseNum(1);
		TempAddressInfo.setStreet("ABC Str");
		TempAddressInfo.setCity("BLR");
		TempAddressInfo.setAddressType('T');
		

		UserAddressBean PempAddressInfo = new UserAddressBean();
		PempAddressInfo.setHouseNum(55);
		PempAddressInfo.setStreet("XYZ Str");
		PempAddressInfo.setCity("HDR");
		PempAddressInfo.setAddressType('P');
		
		List<UserAddressBean> userAddressBeans = new ArrayList<UserAddressBean>();
		userAddressBeans.add(TempAddressInfo);
		userAddressBeans.add(PempAddressInfo);
		
		userInfo.setUserAddressList(userAddressBeans);
		
		

		try {
			JAXBContext context = JAXBContext.newInstance(UserInfoBean.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// For Formatted XML
			marshaller.marshal(userInfo, System.out);
			marshaller.marshal(userInfo, new File("userInfo3.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unable to create");
		}

	}//End of main()

}//End of class
