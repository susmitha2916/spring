package com.vp.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Session session = new AnnotationConfiguration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
					
		  Person p1 = new Person(); 
		  //p1.setPid(101);
		  p1.setPnane("binduu");
		  p1.setAge(31);
		  session.save(p1);	
		  
				
		transaction.commit();
		
		session.close();
		System.out.println("annot done ...");
    }
}
