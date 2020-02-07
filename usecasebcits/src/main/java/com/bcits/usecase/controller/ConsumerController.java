package com.bcits.usecase.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.service.ConsumerService;

@Controller
public class ConsumerController {

	@Autowired
	private ConsumerService service;
	
	@GetMapping("/consAboutUsPage")
	public String displayConsAboutUsPage() {
		return "aboutPage";
	}

	@GetMapping("/mainHomePage")
	public String displayMainHomePage() {
		return "homePage";
	}// displayMainHomePage()

	@GetMapping("/consumerLogin")
	public String displayConsumerLogin() {
		return "consumerLoginPage";
	}// displayConsumerLogin()

	@PostMapping("/loginPage")
	public String consumerLogin(String emailId, String password, HttpServletRequest req, ModelMap modelMap) {
		ConsumerMasterBean consumerInfoBean = service.consumerLogin(emailId, password);
		if (consumerInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("infoBean", consumerInfoBean);
			return "consumerHome";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "consumerLoginPage";
		}
	}// End of consumerLogin()

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

	@GetMapping("/consumerHomePage")
	public String displayConsumerHomePage(HttpSession session, ModelMap modelMap) {

		if (session.isNew()) {
			session.invalidate();
			modelMap.addAttribute("errMsg", "Please Login First!!");
			return "consumerLoginPage";
		} else {
			return "consumerHome";
		}

	}// End of displayConsumerHomePage

	@GetMapping("/currentBill")
	public String displayCurrentBill(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerMasterBill = (ConsumerMasterBean) session.getAttribute("infoBean");

		if (consumerMasterBill != null) {
			CurrentBillBean currentBillBean = service.showCurrentBill(consumerMasterBill.getRrNumber());
			if (currentBillBean != null) {
				modelMap.addAttribute("masterBill", currentBillBean);
				return "currentBillPage";
			} else {

				modelMap.addAttribute("errMsg",
						"The requested operation is unable to perform , " + "Please try again later !");
				return "requestDenieInfoPage";
			}
		} else {
			modelMap.addAttribute("errMsg", "Please Login First!!");
			return "consumerLoginPage";

		}

	}// End of displayCurrentBill()

	@GetMapping("/monthlyConsumption")
	public String displayMonthlyConsumption(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerMasterBean = (ConsumerMasterBean) session.getAttribute("infoBean");

		if (consumerMasterBean != null) {
			List<MonthlyConsumption> monthconsumptionList = service
					.monthlyConsumption(consumerMasterBean.getRrNumber());
			if (monthconsumptionList != null) {
				modelMap.addAttribute("materConsumption", monthconsumptionList);
				return "monthlyConsumption";
			} else {
				modelMap.addAttribute("errMsg", "Unable to process the requested operation!!, Please try again later.");
				return "consumerHome";
			}
		} else {

			modelMap.addAttribute("errMsg", "Please Login First !!");
			return "consumerLoginPage";
		}
	}// End of displayMonthlyConsumption()

	@GetMapping("/billHistoryPage")
	public String displayBillHistorty(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerMasterBean = (ConsumerMasterBean) session.getAttribute("infoBean");

		if (consumerMasterBean != null) {
			List<BillHistoryBean> billHistoryList = service.showBillHistory(consumerMasterBean.getRrNumber());
			if (billHistoryList != null) {
				modelMap.addAttribute("masterBillHistory", billHistoryList);
				return "billHistory";
			} else {
				modelMap.addAttribute("errMsg", "Unable to process the requested operation!!, Please try again later.");
				return "consumerHome";
			}
		} else {
			modelMap.addAttribute("errMsg", "Please Login First");
			return "consumerLoginPage";

		}
	}// End of displayBillHistory()

	@GetMapping("/onlinePayement")
	public String dispalyOnlinePaymentPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerMasterBean = (ConsumerMasterBean) session.getAttribute("infoBean");
		if (consumerMasterBean != null) {
			return "onlinePaymentPage";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "consumerLoginPage";
		}
	}// End of dispalyOnlinePaymentPage()

	@PostMapping("/billPaymentPage")
	public String displaySucessfullPaymentPage(HttpSession session, ModelMap modelMap, double amount) {
		ConsumerMasterBean consumerMasterBean = (ConsumerMasterBean) session.getAttribute("infoBean");
		Date date = new Date();
		if (consumerMasterBean != null) {
			boolean billPay = service.payment(consumerMasterBean.getRrNumber(), date, amount);
			if (billPay == true) {
				modelMap.addAttribute("msg", "Online Payment Successfull");
				return "onlinePaymentPage";
			} else {
				modelMap.addAttribute("errMsg", "Online Payment Failed");
				return "onlinePaymentPage";
			}

		} else {

			return "consumerLoginPage";
		}
	}// End of displaySucessfullPaymentPage()
	
	
	@GetMapping("/consumerLogOut")
	public String consumerLogOut( ModelMap modelMap, HttpSession session) {
		session.invalidate();
		modelMap.addAttribute("errMsg","Successfully Logged Out");
		return "consumerLoginPage";
	}

}// End of the class Controller