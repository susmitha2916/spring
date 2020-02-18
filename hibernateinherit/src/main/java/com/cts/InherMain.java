package com.cts;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InherMain {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		  employee3 employee = new employee3("susmitha","ln3",new Date(),"hr4");
		session.save(employee);
		
		transaction.commit();
		session.close();
		System.out.println("done...");
	}
}
