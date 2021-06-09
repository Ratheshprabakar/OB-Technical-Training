package com.onebill.hibernate.EmployeeDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Employee;

public class GetReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("Employee");
			manager = factory.createEntityManager();
			
			Employee ref = manager.getReference(Employee.class, 1);
			System.out.println("Emp Name "+ ref.getName());
			System.out.println("Emp Salary "+ ref.getSalary());

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			factory = null;
			manager = null;
		}

	}

}
