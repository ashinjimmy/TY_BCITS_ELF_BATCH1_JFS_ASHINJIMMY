package com.bcits.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcits.springboot.beans.EmployeeInfoBean;
import com.bcits.springboot.beans.EmployeeResponse;
import com.bcits.springboot.services.EmployeeService;

//@Controller
@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public EmployeeResponse getEmployeeInfoBean(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);

		EmployeeResponse response = new EmployeeResponse();

		if (employeeInfoBean != null) {
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
		// return employeeInfoBean;
	}// Enf of getEmployeeInfoBean()

	@GetMapping(path = "getAllEmployess", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public EmployeeResponse getAllEmployees() {

		List<EmployeeInfoBean> empList = service.getallEmployees();

		EmployeeResponse response = new EmployeeResponse();

		if (empList != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Found for ID ");
			response.setEmployeeList(empList);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee ID Not Found !!!");
		}
		return response;

		// return service.getallEmployees();
	}// End of getAllEmployees()

	@DeleteMapping(path = "/deleteEmployee/{employeeID}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse deleteEmployee(@PathVariable(name = "employeeID") int empId) {

		boolean isDeleted = service.deleteEmployee(empId);

		EmployeeResponse response = new EmployeeResponse();
		if (isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Deleted Successfully for ID ");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to delete Employee Record !!!");
		}

		return response;

		// return service.deleteEmployee(empId);
	}// End of deleteEmployee()

	@PostMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_ATOM_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {

		boolean isAdded = service.addEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();

		if (isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Added Successfully for ID ");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add Employee Record !!!");
		}

		return response;

		// return service.addEmployee(employeeInfoBean);
	}// End of addEmployee()

	@PutMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_ATOM_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {

		boolean isUpdated = service.updateEmployee(employeeInfoBean);

		EmployeeResponse response = new EmployeeResponse();

		if (isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Record Added Successfully for ID ");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to Add Employee Record !!!");
		}

		return response;

		// return service.updateEmployee(employeeInfoBean);
	}// End of updateEmployee()

}
