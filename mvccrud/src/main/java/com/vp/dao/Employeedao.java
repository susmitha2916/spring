package com.vp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vp.model.Employee;



@Repository
@Transactional
public class Employeedao {
/*List<Employee> list=null;
public List<Employee> getAllEmployees(){
	 list = new ArrayList<Employee>();
	list.add(new Employee("abc",15,13));
	list.add(new Employee("ananya",16,12));
	list.add(new Employee("jerina",17,17));
	list.add(new Employee("name4",15,16));
	
	
	return list;
	
}*/

	@Autowired
	SessionFactory sessionFactory;
	
     public List<Employee> getAllEmployees() {
    	
    	 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
    	 return criteria.list();
     } 
     public void saveOrUpdate(Employee employee) {
  		System.out.println("DATA::: "+employee);
  		sessionFactory.getCurrentSession().saveOrUpdate(employee);
  		System.out.println("employee save upadet Done !!!");
  	}
}
