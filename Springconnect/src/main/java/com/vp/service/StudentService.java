package com.vp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vp.model.Student;
import com.vp.repository.StudentRepository;
@Service
@Transactional
public class StudentService {
	
@Autowired	
 StudentRepository studentrepository;

public List<Student> getAllStudents(){
	return (List<Student>) studentrepository.findAll();
}

public Student addStudent(Student person) {
	return studentrepository.save(person);
}
}
