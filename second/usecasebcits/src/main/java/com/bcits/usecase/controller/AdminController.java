package com.bcits.usecase.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.service.EmployeeService;

@Controller
public class AdminController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/adminLogin")
	public String displayAdminInfo() {
		return "adminLogin";
	}// End of displayAdminInfo()

	@PostMapping("/adminLoginPage")
	public String adminLoginPage(int adminId, String password, HttpServletRequest req, ModelMap modelMapMap) {
		AdminBean adminInfo = service.adminLogin(adminId, password);
		if(adminInfo!= null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("adminInfo", adminInfo);
			session.setAttribute("msg", "Successfully Logged In");
			return "adminHome";
		} else {
			modelMapMap.addAttribute("errMsg","Invalid Credentials");
			return "adminLogin";
		}
	}// End of adminLoginPage()

	@GetMapping("/addEmployee")
	public String dispalyEmployeeAddPage() {
		return "addEmployee";
	}// End of dispalyEmployeeAddPage;

	@GetMapping("/deleteEmployee")
	public String displayDeleteEmp() {
		return "deleteEmplloyee";
	}// End of deleteEmployee()

	@PostMapping("/addEmp")
	public String addEmp(EmployeeMasterBean employeeBean, ModelMap modelMap, HttpSession session) {
		AdminBean adminInfo = (AdminBean) session.getAttribute("adminInfo");
		if (adminInfo != null) {
			if (service.addEmp(employeeBean)) {
				modelMap.addAttribute("msg", "Employee Details Added!!");
				return "adminHome";
			} else {
				modelMap.addAttribute("errMsg", "Already Exists!!");
				return "adminHome";
			}
		} else {
			modelMap.addAttribute("errMsg", "Please Login First!!");
			return "adminLogin";
		}
	}// End of addEmp
	
	@PostMapping("/deleteEmp")
	public String deleteEmp(int empId, HttpSession session, ModelMap modelMap) {
		 AdminBean adminInfo = (AdminBean) session.getAttribute("adminInfo");
		 if(adminInfo != null) {
			 if(service.deleteEmp(empId)) {
				 modelMap.addAttribute("msg", "Employee Details Delete!!");
				 return "adminHome";
			 } else {
				 modelMap.addAttribute("errMsg","Employee Details Found!!");
				 return "adminHome";
			 }
		 }else {
			 modelMap.addAttribute("errMsg", "Please Login First!!");
			 return "adminLogin";
		 }
	}//End of deleteEmp

}// End of adminContoller
