package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vp.model.Employee;
import com.vp.service.Employeeservice;
@Controller
public class Studentcontroller {
	@Autowired
	Employeeservice employeeservice;
	
	@RequestMapping("/home")
	 public String home() {
		 
		 
		 return "home";
	 }
	
	@RequestMapping("/listEmployees")
	public String getEmployee(Model model) {
		List<Employee> list=employeeservice.getAllEmployees();
		model.addAttribute("list",list);
		return "listEmployees";
	} 
	@RequestMapping("/EmpForm")
	 public String saveStudent(Model model) {
		 
		 model.addAttribute("employee", new Employee());
		 return "Form";
	 }
	@PostMapping("/saveEmployee")
	 public String saveStudent(@ModelAttribute("employee") Employee employee) {
		employeeservice.saveOrUpdate(employee);
		 return "redirect:/listEmployees";
	 }
}
