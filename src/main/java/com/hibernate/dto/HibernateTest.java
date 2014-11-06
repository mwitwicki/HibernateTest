package com.hibernate.dto;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateTest {

	/**
	 * Hibernate Test
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnnotationConfiguration config = new AnnotationConfiguration().configure();
		SessionFactory factory = config.buildSessionFactory();
		
		Address address = new Address();
		address.setCity("Warsaw");
		address.setStreet("Przyokopowa 31");
		
		User user = new User();
		user.setUserName("Miroslaw");
		user.setUserAge("30");
		user.setUserAddress(address);
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
