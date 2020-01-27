package com.bcits.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bcits.springmvc.beans.UserBean;

import lombok.Data;

@Controller
public class SpringMVCController {
	//For the date format conversion 
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView displayWelcomeMessage() {
		ModelAndView modelAndView = new ModelAndView();
		/* modelAndView.setViewName("/WEB-INF/views/message.jsp"); */
		modelAndView.setViewName("message");
		return modelAndView;
	}// End of displayWelcomeMessage() (Handler method)

	@RequestMapping(path = "/searchEmployee", method = RequestMethod.GET)
	public ModelAndView searchEmployee(HttpServletRequest req) {
		String empIdVal = req.getParameter("empId");

		ModelAndView modelAndView = new ModelAndView();
		/* modelAndView.setViewName("/WEB-INF/views/searchEmployee.jsp"); */
		modelAndView.setViewName("searchEmployee");
		return modelAndView;
	}// End of searchEmployee()

	/*
	 * @RequestMapping(path = "/loginForm", method = RequestMethod.GET) // making
	 * login form and display public ModelAndView displayLoginForm() { ModelAndView
	 * modelAndView = new ModelAndView();
	 * modelAndView.setViewName("/WEB-INF/views/loginForm.jsp");
	 * 
	 * return modelAndView;
	 * 
	 * }// End of displayLoginForm()
	 */

	@RequestMapping(path = "/loginForm", method = RequestMethod.GET) // making login form and display
	public ModelAndView displayLoginForm(ModelAndView modelAndView) {
		/* modelAndView.setViewName("/WEB-INF/views/loginForm.jsp"); */
		modelAndView.setViewName("loginForm");
		return modelAndView;
	}// End of displayLoginForm()

	@RequestMapping(path = "/login1", method = RequestMethod.POST)
	public ModelAndView login1(HttpServletRequest req, ModelAndView modelAndView) {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt("empIdVal");
		String password = req.getParameter("password");

		modelAndView.addObject("empId", empId);
		modelAndView.addObject("pwd", password);
		/* modelAndView.setViewName("/WEB-INF/views/userDetails.jsp"); */
		modelAndView.setViewName("userDetails");
		return modelAndView;
	}// End of login1()

	// Alternate method 2

	@PostMapping("/login2")
	public ModelAndView login2(@RequestParam(name = "empId") int empId,
			@RequestParam(name = "password") String password, ModelAndView modelAndView) {
		modelAndView.addObject("empId", empId);
		modelAndView.addObject("pwd", password);
		/* modelAndView.setViewName("/WEB-INF/views/userDetails.jsp"); */
		modelAndView.setViewName("userDetails");
		return modelAndView;
	}// End of login2()

	// Alternate method 3

	@PostMapping("/login3") // Here the variable name should be same
	public String login3(Integer empId, String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("pwd", password);
		/* return "/WEB-INF/views/userDetails.jsp"; */
		return "userDetails";
	}// End of login3()

	@PostMapping("/login4")
	public String login4(UserBean userBean, String name, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		modelMap.addAttribute("name", name);
		/* return "/WEB-INF/views/userDetails2.jsp"; */
		return "userDetails2";
	}// End of login4()
}// End of Class
