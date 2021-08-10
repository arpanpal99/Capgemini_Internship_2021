package com.capgemini.lesson1_hibernate_telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.capgemini.lesson1_hibernate_telusko.entity.Laptop;
import com.capgemini.lesson1_hibernate_telusko.entity.Student;
import com.capgemini.lesson1_hibernate_telusko.util.HibernateUtil;

public class StudentApp {

	public static void main(String[] args) {
		
		Student st1 = null, st2 = null;	Laptop lt1 = null, lt2 = null, lt3 = null;
		
//		lt1 = new Laptop(100, "Lenovo Legion");
//		st1 = new Student(58, "Jack", 92, lt); 			// OneToOne - One Student can have one laptop
//					
//		st1 = new Student(84, "Arpan", 96);				// OneToMany - One Student can have many laptops, like lt1 and lt2
//		lt1 = new Laptop(101, "Lenovo Ideapad", st2);	
//		lt2 = new Laptop(102, "HP Pavilion G6", st2);	
//		st2.getLaptList().add(lt1);						// This creates a new table because of OneToMany Relationship
//		st2.getLaptList().add(lt2);						// But if we set a mappedBy property, the redundant table won't be there
		
		st1 = new Student(62, "Mark", 93);
		st2 = new Student(67, "Tony", 98);
		lt1 = new Laptop(103, "Dell Vostro");
		lt2 = new Laptop(104, "Macbook Pro");
		lt3 = new Laptop(105, "Sony Vaio");
		
		st1.getLaptopList().add(lt1);
		st1.getLaptopList().add(lt2);	// st1 owns two laptops lt1 & lt2	
		st2.getLaptopList().add(lt3);	
		st2.getLaptopList().add(lt2);	// st2 owns two laptops lt2 & lt3. Hence lt2 is shared by both st1 & st2 
		
		lt1.getStudList().add(st1);
		lt2.getStudList().add(st1);
		lt2.getStudList().add(st2);
		lt3.getStudList().add(st2);
		
//		------------------------------------------------------------------------------------------------------------------------
//		Hibernate Connection & Session
//		------------------------------------------------------------------------------------------------------------------------		
//		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);				
//		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();		
//		SessionFactory sfac = config.buildSessionFactory(reg);
//    	Session session = sfac.openSession();	
//    	Transaction tx = session.beginTransaction();
//    	
//    	session.save(lt1);   	session.save(lt2);    	session.save(lt3);		// Saving laptop table
//    	session.save(st1);    	session.save(st2);								// Saving student table
//    	tx.commit();
		
//		------------------------------------------------------------------------------------------------------------------------
//		Hibernate Connection & Session (Using Hibernate Util Class)
//		------------------------------------------------------------------------------------------------------------------------		
		Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession(); 	// Open a Session using HibernateUtil
        	transaction = session.beginTransaction();					      	// Start a transaction       	
        	session.save(lt1);   	session.save(lt2);    	session.save(lt3);	// Saving laptop table
        	session.save(st1);    	session.save(st2);							// Saving student table        	
        	transaction.commit();												// Commit Transaction 
        } 
        catch(Exception e) {
        	if(transaction != null) transaction.rollback();
        	e.printStackTrace();
        }
		
	}
}
