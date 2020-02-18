package com.cts.hiberonetoone;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cts.hiberonetoone.HibernateUtil;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address1 = new Address("O ", "Chennai8", "TN2", "600097");
			Address address2 = new Address("Ring Road", "Banglore2", "Karnataka2", "560000");
			Student student1 = new Student("ananya", address1);
			Student student2 = new Student("jerina", address2);
			session.save(student1);
			session.save(student2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
    }

