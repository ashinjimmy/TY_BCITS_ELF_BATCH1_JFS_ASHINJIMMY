package com.bcits.usecase.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.service.ConsumerService;

@Controller
public class ConsumerController {

	@Autowired
	private ConsumerService service;

	@GetMapping("/mainHomePage")
	public String displayMainHomePage() {
		return "homePage";
	}// displayMainHomePage()

	@GetMapping("/consumerLogin")
	public String displayConsumerLogin() {
		return "consumerLoginPage";
	}// displayConsumerLogin()
	
	
	@PostMapping("/loginPage") 
	public String consumerLogin(String emailId, String password , HttpServletRequest req , ModelMap modelMap) {
		System.out.println(emailId+password);
		ConsumerMasterBean consumerInfoBean = service. consumerLogin( emailId , password);
		System.out.println(emailId+password);
		if( consumerInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("infoBean", consumerInfoBean);
			return "consumerHome";
		} else  {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "consumerLoginPage";
		}		
	}// End of  consumerLogin()
	
	@GetMapping("/consumerSignUpPage")
	public String displayConsumerSignUpPage1() {
		return "consumerSignUpPage";
	}

	@PostMapping("/consumerSignUp")
	public String consumerSignUpPage(ConsumerMasterBean consumerMasterBean, String confirmed, ModelMap modelMap) {
		if (service.consumerSignUp(consumerMasterBean, confirmed)) {
			modelMap.addAttribute("msg", "Signup successfully!!");
			return "consumerLoginPage";
		} else {
			modelMap.addAttribute("errMsg", "Already Exists!!");

		}

		return "consumerSignUpPage";
	}
	
	

}