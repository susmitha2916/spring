package com.vp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vp.model.Teacher;
import com.vp.service.Teacherservice;

@RestController
public class Teachercontroller 
{
	
	 @Autowired
	 Teacherservice Service;
	
	 @GetMapping("/teacher")
     public List<Teacher> listAllTeacher(){ 
		 
    	 return (List<Teacher>) Service.getAllTeacher(); 
     }
	 
	@RequestMapping(value = "/teacherByName/{name}", method = RequestMethod.GET)
	public List<Teacher> getTeacherByFirstname(@PathVariable String name) {
		return Service.findByFirstname(name);
	}
	
	@RequestMapping(value = "/teacher", method = RequestMethod.POST)
	public HttpStatus insertPersone(@RequestBody Teacher teacher) {
		return Service.addTeacher(teacher) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteTeacher(@PathVariable Long id) {
		Service.deleteTeacher(id);
		return HttpStatus.NO_CONTENT;
	}
	
	@RequestMapping(value = "/teacher", method = RequestMethod.PUT)
	public HttpStatus updateTeacher(@RequestBody Teacher teacher) {
		return Service.updateTeacher(teacher)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/teacher/{id}", method = RequestMethod.GET)
	public Optional<Teacher> getTeacher(@PathVariable Long id) {
		return Service.getById(id);
	}
}