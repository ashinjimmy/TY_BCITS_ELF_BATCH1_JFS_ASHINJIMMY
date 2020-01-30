package com.bcits.employeedatajpa.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcits.employeedatajpa.beans.EmployeeInfoBean;
import com.bcits.employeedatajpa.beans.EmployeeResponse;
import com.bcits.employeedatajpa.repository.EmployeeRepository;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeRepository repository;

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getResponse(int empId) {

//		EmployeeInfoBean employeeInfoBean = repository.findById(empId).get();
		Optional<EmployeeInfoBean> op = repository.findById(empId);
		
		EmployeeResponse response = new EmployeeResponse();

		if (op.isPresent()) {
			EmployeeInfoBean employeeInfoBean = op.get();
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Found for ID " + empId);
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee ID Not Found !!!");
		}

		return response;

	}// Enf of getEmployeeInfoBean()
	
	
	
	@GetMapping(path = "/getEmpByIdPwd", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getResponse(int empId, String password) {

		EmployeeInfoBean employeeInfoBean = repository.getEmployeeByIdAndPwd(empId, password);
		//Optional<EmployeeInfoBean> op = repository.findById(empId);
		
		EmployeeResponse response = new EmployeeResponse();

		if (employeeInfoBean != null) {
//			EmployeeInfoBean employeeInfoBean = op.get();
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Found for ID " + empId);
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee ID Not Found !!!");
		}

		return response;

	}// Enf of getEmployeeInfoBean()
	
	
	
}
