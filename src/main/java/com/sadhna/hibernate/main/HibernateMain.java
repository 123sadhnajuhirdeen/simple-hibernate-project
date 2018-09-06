package com.sadhna.hibernate.main;

import java.util.Date;

import org.hibernate.Session;

import com.sadhna.hibernate.model.Employee;
import com.sadhna.hibernate.util.HibernateUtil;

public class HibernateMain {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Sadhna");
		emp.setRole("CEO");
		emp.setInsertTime(new Date());
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		//ssave the model object
		session.save(emp);
		
		//commit transaction
		session.getTransaction().commit();
		System.out.println("Employee Is="+emp.getId());
		
		//terminate session fac
		HibernateUtil.getSessionFactory().close();
		
	}
}
