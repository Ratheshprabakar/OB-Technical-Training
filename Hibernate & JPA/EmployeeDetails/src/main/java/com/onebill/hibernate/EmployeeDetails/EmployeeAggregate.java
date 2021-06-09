/**
 * 
 */
package com.onebill.hibernate.EmployeeDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 * @author Rathesh Prabakar
 *
 */
public class EmployeeAggregate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();
		
		String sumQuery = "select sum(salary) from Employee";
		String maxQuery = "select max(salary) from Employee";
		String minQuery = "select min(salary) from Employee";


		Query sumquery = manager.createQuery(sumQuery);
		Query maxquery = manager.createQuery(maxQuery);
		Query minquery = manager.createQuery(minQuery);

		
		double salarySum = (double) sumquery.getSingleResult();
		double maxSalary = (double) maxquery.getSingleResult();
		double minSalary = (double) minquery.getSingleResult();

				
		System.out.println("Salary Sum "+ salarySum);
		System.out.println("Max Salary "+maxSalary);
		System.out.println("Min Salary "+ minSalary);

	}

}
