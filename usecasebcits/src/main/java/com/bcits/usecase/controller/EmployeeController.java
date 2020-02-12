package com.bcits.usecase.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.tuple.GeneratedValueGeneration;
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
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.mailgeneration.EmailGeneration;
import com.bcits.usecase.service.ConsumerService;
import com.bcits.usecase.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@Autowired
	private ConsumerService consumerService;
	
	private EmailGeneration generation = new EmailGeneration();

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/employeeLoginPage")
	public String displayEmpLogin() {
		return "employeeLogin";
	}// End of displayEmpLogin()

	@GetMapping("/billDisplayPage")
	public String displayEmpBillGenerate(ModelMap modelMap, HttpSession session) {

		EmployeeMasterBean empBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		if (empBean != null) {

		}
		return "empBillGenerator";
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
		EmployeeMasterBean empBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		if (empBean != null) {
			ConsumerMasterBean consumerBean = consumerService.getConsumer(rrNumber);
			double prev = service.getIntialReading(rrNumber);
			if (consumerBean != null) {
				
				modelMap.addAttribute("billMaster", consumerBean);
				modelMap.addAttribute("previous", prev);
			}
		} else {
			modelMap.addAttribute("errMsg", "Unable to process the request");
			return "employeeLogin";
		}
		return "empBillGenerator";

	}// generateCurrentBill()

	@PostMapping("/generateCurrentBill")
	public String generateCurrrentBill(ModelMap modelMap, HttpSession session, CurrentBillBean currentBillBean) {
		EmployeeMasterBean employeeMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		System.out.println(employeeMasterBean);
		if (employeeMasterBean != null) {
			List<ConsumerMasterBean> consumerList = service.showAllConsumerDetails(employeeMasterBean.getRegion());
			System.out.println(consumerList);
			ConsumerMasterBean masterBean = consumerService.getConsumer(currentBillBean.getRrNumber());
			if (service.addCurrentBill(currentBillBean)) {
				generation.sendMail(currentBillBean,masterBean);
				modelMap.addAttribute("msg", "Electricity Bill Generated Successfully.");
				modelMap.addAttribute("consumerList", consumerList);
			} else {
				modelMap.addAttribute("errMsg", "Bill Generation Failed, already generated once. ");
				modelMap.addAttribute("consumerList", consumerList);
			}
			return "empBillGenerator";

		} else {
			modelMap.addAttribute("errMsg", "Please Login First");
			return "employeeLogin";
		}

	}// end of generateCurrentBill()

	@GetMapping("/showAllCurrentBills")
	public String showAllBills(HttpSession session, ModelMap modelMap) {
		EmployeeMasterBean employeeMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		if (employeeMasterBean != null) {
			List<MonthlyConsumption> billList = consumerService.showAllBillList(employeeMasterBean.getRegion());
			if (billList != null && !billList.isEmpty()) {
				modelMap.addAttribute("billDetails", billList);
			} else {
				modelMap.addAttribute("errMsg", "Record is not Found!!");
			}
			return "showAllCurrentBills";

		} else {
			modelMap.addAttribute("errMsg", "Please Login First!!");
			return "employeeLogin";
		}

	}// End of showAllCurrentBills()
	
	
	@GetMapping("/seeQueryInfo")
	public String displayQueryInfo (ModelMap modelMap, HttpSession session) {
		 EmployeeMasterBean employeeMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		 if(employeeMasterBean != null) {
			 List<QueryMsgBean> queryList= service.getQueryList(employeeMasterBean.getRegion());
			 if(queryList != null && !queryList.isEmpty()) {
				 modelMap.addAttribute("query",queryList);
			 } else {
				 modelMap.addAttribute("errMsg","No Queries Raised");
			 }
			 return "queryInfoPage";
		 } else  {
			 modelMap.addAttribute("errMsg","Enntered Invalid Credentials");
			 return "employeeLogin";
		 } 
	}//End of displayQueryInfo

	
	@PostMapping("/sendResponse")
	public String sendResponseForQuery(ModelMap modelMap, HttpSession session, String rrNumber
			, String query, Date date) {
		System.out.println(query);
		EmployeeMasterBean employeeMasterBean = (EmployeeMasterBean) session.getAttribute("masterInfo");
		if(employeeMasterBean != null) {
			List<QueryMsgBean> queryList = service.getQueryList(employeeMasterBean.getRegion());
			modelMap.addAttribute("query",queryList);
			if(service.sendRespond(rrNumber, query, date)) {
				modelMap.addAttribute("msg","Response Generated");
			}
			return "queryInfoPage";
		} else {
			modelMap.addAttribute("errMsg","Invalid Credentials");
			return "employeeLogin";
		}
		
	}//End of  sendResponseForQuery()
	
	
	@GetMapping("/revenueBillDetails")
	public String billRevenueDetails( HttpSession session, ModelMap modelMap ) {
		EmployeeMasterBean empBean = (EmployeeMasterBean) session.getAttribute("masterInfo");

		if (empBean != null) {
			double totalBillAmount  = consumerService.totalGeneratedBillAmount(empBean.getRegion());
			double collectedBillAmount   = consumerService.collectedBillAmount(empBean.getRegion());
			double pendingBillAmount = totalBillAmount -  collectedBillAmount ;
			System.out.println(  totalBillAmount);
			System.out.println(collectedBillAmount  );
			System.out.println( pendingBillAmount);
			modelMap.addAttribute("totalBill", totalBillAmount);
			modelMap.addAttribute("collectedBill", collectedBillAmount );
			modelMap.addAttribute("pendingBill", pendingBillAmount );
			return "revenueDetails";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credentials");
			return "employeeLogin";
		}
	}// End of 
	

}// End of class