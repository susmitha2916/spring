package com.vp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Teacher {

    @Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Id;
	
}
