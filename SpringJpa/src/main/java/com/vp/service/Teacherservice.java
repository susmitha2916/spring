package com.vp.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.Teacher;
import com.vp.repository.TeacherRepository;

@Service
public class Teacherservice 
{
	
	@Autowired
	TeacherRepository Repository;
	
	@Transactional
	public List<Teacher> getAllTeacher() {
		return (List<Teacher>) Repository.findAll();
	}
	
	@Transactional
	public List<Teacher> findByFirstname(String name) {
		return Repository.findByFirstname(name);
	}

	@Transactional
	public Optional<Teacher> getById(Long id) {
		return Repository.findById(id);
	}

	@Transactional
	public void deleteTeacher(Long personId) {
		Repository.deleteById(personId);
	}

	@Transactional
	public boolean addTeacher(Teacher person) {
		return Repository.save(person) != null;
	}

	@Transactional
	public boolean updateTeacher(Teacher person) {
		return Repository.save(person) != null;
	}
}