package com.vp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vp.dao.Employeedao;
import com.vp.model.Employee;

@Service
public class Employeeservice {
	@Autowired
 Employeedao employeedao;
	public List<Employee> getAllEmployees(){
		return employeedao.getAllEmployees();
		
	}
	public void saveOrUpdate(Employee employee) {
		employeedao.saveOrUpdate(employee);
	}
}
