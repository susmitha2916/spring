package com.vp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vp.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
	List<Teacher> findByFirstname(String name);
}