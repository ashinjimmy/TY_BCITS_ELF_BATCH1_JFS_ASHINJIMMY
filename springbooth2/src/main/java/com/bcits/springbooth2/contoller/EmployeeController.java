package com.bcits.springbooth2.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcits.springbooth2.beans.EmployeeInfoBean;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@GetMapping(path = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeInfoBean getEmployee(int empId) {

		Optional<EmployeeInfoBean> employee = repository.findById(empId);

		if (employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}

	}// End of getEmployee()

	@PostMapping(path = "/addEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeInfoBean adEmployeeInfoBean(@RequestBody EmployeeInfoBean employeeInfoBean) {
		EmployeeInfoBean infoBean = repository.save(employeeInfoBean);
		return infoBean;
	}// End of adEmployeeInfoBean()

}// End of controller
