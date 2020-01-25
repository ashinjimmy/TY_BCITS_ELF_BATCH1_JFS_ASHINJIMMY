package com.bcits.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.bcits.springmvc.beans.EmployeeInfoBean;
import com.bcits.springmvc.curdoperations.EmployeeDAO;
import com.bcits.springmvc.curdoperations.EmployeeDAOimpl;
import com.bcits.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/login")
	public String displayLoginForm() {
		return "empLoginForm";
	}// End of displayLoginForm()

	@PostMapping("/login")
	public String authenticate(int empId, HttpServletRequest req, String password, ModelMap modelMap) {
	
		EmployeeInfoBean employeeInfoBean = service.authenticate(empId, password);

		if (employeeInfoBean != null) {
			// Valid Credentials
			HttpSession session = req.getSession(true);
			session.setAttribute("loggedInEmpInfo", employeeInfoBean);
			return "employeeHome";
		} else {
			// Invalid Credentials
			modelMap.addAttribute("errMsg", "Invalid Credentials");
			return "empLoginForm";
		}
	}// End of authenticate()

	@GetMapping("/searchEmpForm")
	public String displayEmployeeForm(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			// user logged in
			session.invalidate();
			
			modelMap.addAttribute("errMsg", "Please Login First");
			return "empLoginForm";
			
		} else {
			// user already logged in
			return "searchEmpForm";
		}
	}// End of displayEmployeeForm()
	
	@GetMapping("/search")
	public String searchEmployee(int empId, HttpSession session, ModelMap modelMap) {
		
		if(session.getAttribute("loggedInEmpInfo") != null) {
			//Valid Session 
		
			EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
			
			if(employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean",employeeInfoBean);
			} else {
				modelMap.addAttribute("errMsg","Employee Id Not Found!!");
			}
			return "searchEmpForm";
			} else {
				//Invalid Session
				modelMap.addAttribute("errMsg","Please Login First");
				return "empLoginForm";
			}
		}//End of searchEmployee()
	
	@GetMapping("/deleteEmpForm")
	public String displayDeleteEmployeeForm(
			@SessionAttribute(name = "loggedInEmpInfo", required = false)
	EmployeeInfoBean employeeInfoBean, ModelMap modelMap ) {
		
		if(employeeInfoBean != null) {
			// Valid session 
			return "deleteEmpForm";
		} else {
			//Invalid session
			modelMap.addAttribute("errMsg", "Please Login First");
			return "empLoginForm";
		}
	} //End of displayDeleteEmployeeForm()
	
	
	@GetMapping("/delete")
	public String deleteEmployee(
			int empId, @SessionAttribute(name= "loggedInEmpInfo", required = false)EmployeeInfoBean employeeInfoBean,
			ModelMap modelMap) {
	
	
		if(employeeInfoBean != null) {
			//Valid Session
			if(service.deleteEmployee(empId)) {
				modelMap.addAttribute("msg","Employee Record deleted Successfully");
			} else {
				
				modelMap.addAttribute("errMsg", "Employee Id Not found!!");
			}
			return "deleteEmpForm";
		} else {
			//Invalid Session
			modelMap.addAttribute("errMsg", "Please Login First");
			return "empLoginForm";
		}
	}//End of deleteEmployee
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("errMsg", "You Are Successfully Logged out");
		return "empLoginForm";
	}//End of logout()
	

}// End of Class
