package com.onebill.hibernate.EmployeeDetails;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectEmployeeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("Employee");
			manager = factory.createEntityManager();
			
			String query = "select name from Employee";
			Query q = manager.createQuery(query);
			
			@SuppressWarnings("unchecked")
			List<String> l = (List<String>) q.getResultList();
			
			for (String string : l) {
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
