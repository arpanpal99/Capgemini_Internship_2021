package com.capgemini.lesson1_hibernate_telusko.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.capgemini.lesson1_hibernate_telusko.entity.Laptop;
import com.capgemini.lesson1_hibernate_telusko.entity.Student;

/*
 * Helper Class to add hibernate functionality to the application
 * which helps to instantiate Session Factory during application initialization
 */

public class HibernateUtil {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {				
				Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);				
				registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();		
				sessionFactory = config.buildSessionFactory(registry); 
			} 
			catch(Exception e) {
				e.printStackTrace();
				if(registry != null) StandardServiceRegistryBuilder.destroy(registry);
			}
		}
		return sessionFactory;
	}

}
