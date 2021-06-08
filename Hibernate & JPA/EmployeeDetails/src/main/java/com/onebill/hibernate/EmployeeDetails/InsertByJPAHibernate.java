/**
 * 
 */
package com.onebill.hibernate.EmployeeDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Employee;

/**
 * @author Rathesh Prabakar
 *
 */
public class InsertByJPAHibernate {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(1234);
		emp1.setName("Karthik D");
		emp1.setSalary(1237218);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
			     
	    EntityManager manager = entityManagerFactory.createEntityManager();
			     
	    EntityTransaction transaction = manager.getTransaction();
	    
	    transaction.begin();
	    manager.persist(emp1);
	    transaction.commit();
	    
	    System.out.println("Entered Successfully using JPA Hibernate");
	    
	}
	

}
