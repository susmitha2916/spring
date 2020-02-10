package com.vp.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class Emp {
	
	@Min(value = 50 ,message="enter above 50")
	@Max(value=100, message="should nor be more than 100")
	 private int id;
	@NotEmpty(message="should not be empty")
	 private String name;
	@NotEmpty(message="should not be empty")
	 private String ad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, String ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
}
