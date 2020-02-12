package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vp.dao.Studentdao;
import com.vp.model.Student;

@RestController
public class HomeController {
	@Autowired
Studentdao dao;

	@RequestMapping("/homedata")
	public ResponseEntity<Student> getHomeData() {
		
		return new ResponseEntity<Student>(new Student(11,"Giri", "Add1111"), HttpStatus.OK);
			
	}
	@GetMapping("/getAllUsers")
	public List<Student> getUsers(){
				
		return dao.getUsers();
	}
	@GetMapping("/user/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
		return dao.getStudent(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<Student> saveUser(@RequestBody Student student) {
		return dao.insertUser(student);
	}
	
	@DeleteMapping("user/{id}")
	public int deleteUser(@PathVariable("id") int id) {
		return dao.deleteStudent(id);
	}
}
