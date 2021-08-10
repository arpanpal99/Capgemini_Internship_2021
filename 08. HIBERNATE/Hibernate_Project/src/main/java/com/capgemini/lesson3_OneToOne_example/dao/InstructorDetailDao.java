package com.capgemini.lesson3_OneToOne_example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.lesson3_OneToOne_example.entity.InstructorDetail;
import com.capgemini.lesson3_OneToOne_example.util.HibernateUtil;

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
