package com.capgemini.lesson1_hibernate_telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.capgemini.lesson1_hibernate_telusko.entity.Alien;
import com.capgemini.lesson1_hibernate_telusko.entity.AlienName;

public class AlienApp 
{
    public static void main( String[] args )
    {
    	
//    	Store the data in database
//    	--------------------------
    	Alien voyd1 = new Alien(1001, new AlienName("Arpan", "", "Pal"), "green", "krypton");
    	Alien voyd2 = new Alien(1002, new AlienName("John", "Madison", "Smith"), "red", "namek");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);   	
    	//SessionFactory sfac = con.buildSessionFactory();	
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sfac = con.buildSessionFactory(reg);
    	Session session = sfac.openSession();	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(voyd1);
    	session.save(voyd2);
//    	sess.delete(voyd1);
//    	sess.delete(voyd1);
    	
    	tx.commit();
//    	Data stored in database
    	
//    	------------------------
    	
//    	Fetch data from database
    	
//    	Alien fetchAlien = (Alien)session.get(Alien.class, 1001);
//    	System.out.println(fetchAlien);
    	
    	
    }
}
