package com.cts.hiberonetomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department {
	
@Id
@GeneratedValue
@Column(name="DEPARTMENT_ID")
private int departmentid;
 public int getDepartmentid() {
	return departmentid;
}


public void setDepartmentid(int departmentid) {
	this.departmentid = departmentid;
}


public String getDepartmentname() {
	return departmentname;
}


public void setDepartmentname(String departmentname) {
	this.departmentname = departmentname;
}


public Set<WorkEmployee> getEmployees() {
	return employees;
}


public void setEmployees(Set<WorkEmployee> employees) {
	this.employees = employees;
}


@Column(name="DEPARTMENT_NAME")
 private String departmentname;
 
 
 @OneToMany(mappedBy="department")// this is the field in WorkEmployee //class(table)
 private Set<WorkEmployee> employees;
}
