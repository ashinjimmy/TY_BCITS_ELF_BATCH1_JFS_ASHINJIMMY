package com.bcits.springcoreannotation.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class MessageBean implements InitializingBean, DisposableBean {

	private String message;

	public MessageBean() {
		System.out.println("It's Instantiation phase!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("It's Initilization");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("It's Destroy Phase");

	}

}// End of the class
