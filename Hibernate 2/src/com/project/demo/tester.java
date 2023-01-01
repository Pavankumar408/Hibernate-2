package com.project.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class tester {
	public static void main(String[]args) {
		Configuration config=new Configuration();
		config.addAnnotatedClass(employee.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		employee emp=new employee(5, "srini", 35, "M", 40000);
		session.save(emp);
		System.out.println("data saved sucessfully");
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		
		
		
	}

}
