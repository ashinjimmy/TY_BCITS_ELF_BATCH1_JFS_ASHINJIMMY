package com.bcits.usecase.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.TariffMaster;
import com.bcits.usecase.service.ConsumerService;
import com.bcits.usecase.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@Autowired
	private ConsumerService consumerService;

	@Autowired
	private TariffMaster tariffMaster;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/employeeLoginPage")
	public String displayEmpLogin() {
		return "employeeLogin";
	}// End of displayEmpLogin()

	@PostMapping("/loginEmployee")
	public String employeeLoginSuccessfull(int empId, String password, HttpServletRequest req, ModelMap modelMap) {
		EmployeeMasterBean empBean = service.empAuthentication(empId, password);

		if (empBean != null) {
			long count = service.numberOfConsumers(empBean.getRegion());
			HttpSession session = req.getSession(true);
			session.setAttribute("masterInfo", empBean);
			modelMap.addAttribute("count", count);
			return "employeeHome";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credentials");
			return "employeeLogin";
		}
	}// End of employeeLoginSuccessfull()

	@GetMapping("/employeeHomePage")
	public String displayHomePage(ModelMap modelMap, HttpSession session) {

		EmployeeMasterBean empBean = (EmployeeMasterBean) session.getAttribute("masterInfo");

		if (empBean != null) {
			long count = service.numberOfConsumers(empBean.getRegion());
			modelMap.addAttribute("count", count);
			return "employeeHome";
		}
		return "employeeLogin";

	}// End Of displayHomePage()

	@GetMapping("/consumerDetails")
	public String showConsumerDetails(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean empBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		System.out.println(empBean);

		if (empBean != null) {
			List<ConsumerMasterBean> conMasterBean = service.showAllConsumerDetails(empBean.getRegion());
			System.out.println(conMasterBean);
			if (!conMasterBean.isEmpty()) {
				modelMap.addAttribute("consumerInfo", conMasterBean);
			} else {
				modelMap.addAttribute("errMsg", "Unable to generate the result for the requested Operations!!!");
			}
			return "empConsumerDetails";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First !!");
			return "employeeLogin";
		}
	}// End of showConsumerDetails()

	@GetMapping("/displayGenerateBill")
	public String generateCurrentBill(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		System.out.println(employeeMasterBean);
		if (employeeMasterBean != null) {
			String region = employeeMasterBean.getRegion();
			List<ConsumerMasterBean> consumerBeanList = service.showAllConsumerDetails(employeeMasterBean.getRegion());
			if (!consumerBeanList.isEmpty()) {
				modelMap.addAttribute("consumerInfo", consumerBeanList);
				System.out.println(consumerBeanList);
			} else {
				modelMap.addAttribute("errMsg", "Record Not Exists!");
			}
			return "generateCurrentBill";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First!");
			return "employeeLogin";
		}
	}// End of generateCurrentBill()

	@GetMapping("/empAboutUsPage")
	public String displayEmpAboutPage() {
		return "aboutPage";
	}// End of dispalyAboutPage()

	@GetMapping("/employeeLogOut")
	public String employeeLogOut(ModelMap modelMap, HttpSession session) {
		session.invalidate();
		modelMap.addAttribute("errMsg", "Successfully Logged Out");
		return "employeeLogin";
	}// employeeLogOut()

	@GetMapping("/billGenerator")
	public String generateCurrentBill(ModelMap modelMap, HttpSession session, String rrNumber) {

		System.out.println(rrNumber);
		EmployeeMasterBean empBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		if (empBean != null) {
			ConsumerMasterBean consumerBean = consumerService.getConsumer(rrNumber);
			double prev = consumerService.previousReading(rrNumber);
			System.out.println(prev);
			if (consumerBean != null) {
				modelMap.addAttribute("billMaster", consumerBean);
				modelMap.addAttribute("previous", prev);
				System.out.println(prev);
			}
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credentials");
			return  "employeeLogin"; 
		}
		return "generateCurrentBill";
		}
	}//generateCurrentBill()


@GetMapping("/generateCurrentBill")
public String generateCurrrentB(ModelMap modelMap, HttpSession session , CurrentBillBean currentBillBean) {
	EmployeeMasterBean employeeMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
	if(employeeMasterBean != null ) {
	List<ConsumerMasterBean> consumerList	= service.showAllConsumerDetails(employeeMasterBean.getRegion());
	System.out.println(consumerList);
	if(service.a) {
		
	}
	
	}
}



}// End of class