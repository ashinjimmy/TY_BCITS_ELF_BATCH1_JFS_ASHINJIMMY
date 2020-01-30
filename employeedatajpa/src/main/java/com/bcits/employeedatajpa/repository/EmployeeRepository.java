package com.bcits.employeedatajpa.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bcits.employeedatajpa.beans.EmployeeInfoBean;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {
	
	@Query("from EmployeeInfoBean where empId = :id and password = :pwd")
	public EmployeeInfoBean getEmployeeByIdAndPwd(int id, @Param("pwd") String password);

}
