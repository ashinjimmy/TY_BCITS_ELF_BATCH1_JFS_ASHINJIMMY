package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.beans.UserAddressBean;
import com.bcits.springrestjaxb.beans.UserInfoBean;
import com.bcits.springrestjaxb.beans.UserOtherInfoBean;

public class UserJsonMarshalling {
	
	public static void main(String[] args) {
		

		 UserInfoBean userInfoBean = new UserInfoBean();
		 userInfoBean.setEmpId(9999);
		 userInfoBean.setBloodgrp("B+ve");
		 userInfoBean.setDeptId(11);
		 userInfoBean.setDesignation("SSD");
		 userInfoBean.setDob(new Date());
		 userInfoBean.setDoj(new Date());
		 userInfoBean.setEmpMobileno(7907170787L);
		 userInfoBean.setEmpName("Rajdeep");
		 userInfoBean.setMailId("rajdeep@email.com");
		 userInfoBean.setManagerId(23);
		 userInfoBean.setPassword("qwerty");
		 
		 // Marshalling into JSON
		 
			UserOtherInfoBean userOtherInfoBean = new UserOtherInfoBean();
			userOtherInfoBean.setGender("male");
			userOtherInfoBean.setAdharNumber(123456789L);

			userInfoBean.setUserOtherInfoBean(userOtherInfoBean);
			
			
			
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
			
			userInfoBean.setUserAddressList(userAddressBeans);
		 
		 try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writerWithDefaultPrettyPrinter();// formated JSON object
			mapper.writeValue(new File("empJson9.json"), userInfoBean);
			mapper.writeValue(System.out, userInfoBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}//End of main()
	

}
