package com.capgemini.hibernateonetooneexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.capgemini.hibernateonetooneexample.entity.Instructor;
import com.capgemini.hibernateonetooneexample.entity.InstructorDetail;
import com.capgemini.hibernateonetooneexample.util.HibernateUtil;

public class InstructorDetailDao {
	
	//inserting the instructordetail
	public void SaveInstructorDetail(InstructorDetail instructorDetail) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			//start transaction
			transaction =  session.beginTransaction();
			//save the instructor object
			session.save(instructorDetail);
			//commit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
}
