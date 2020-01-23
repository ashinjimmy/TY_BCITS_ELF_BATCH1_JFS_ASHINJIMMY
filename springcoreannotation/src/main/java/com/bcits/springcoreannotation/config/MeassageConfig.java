package com.bcits.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bcits.springcoreannotation.beans.MessageBean;
import com.bcits.springcoreannotation.mypostprocessors.MyBeanFactoryPostProcessor;
import com.bcits.springcoreannotation.mypostprocessors.MyBeanPostProcessor;

@Configuration
public class MeassageConfig {

	@Bean(name = "messageBean")
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Welcome Back to Spring Core....");
		return messageBean;

	}

	@Bean
	public MyBeanPostProcessor getMyBPP() {
		return new MyBeanPostProcessor();
	}
	
	
	@Bean
	public MyBeanFactoryPostProcessor getMyBFPP() {
		return new MyBeanFactoryPostProcessor();
	}

}// End of Class
