package com.bcits.springsecuritymvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;
import com.bcits.springsecuritymvc.dao.EmpDAO;

@Service
public class EmpServiceHibernateImp implements EmpService {

	@Autowired
	private EmpDAO dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public boolean register(EmpInfoBean empInfoBean) {
		
		EmpInfoBean emp = dao.getEmployee(empInfoBean.getEmpId());
		if(emp  == null) {
			empInfoBean.setPassword(passwordEncoder.encode(empInfoBean.getPassword()));
		}
		return dao.register(empInfoBean);

	}

	@Override
	public EmpInfoBean getEmployee(int empId) {
		return dao.getEmployee(empId);
	}

	@Override
	public List<EmpInfoBean> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
