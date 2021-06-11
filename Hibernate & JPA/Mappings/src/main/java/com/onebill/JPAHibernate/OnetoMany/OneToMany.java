/**
 * 
 */
package com.onebill.JPAHibernate.OnetoMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.JPAHibernate.OnetoMany.bean.CustomerOneToMany;
import com.onebill.JPAHibernate.OnetoMany.bean.LoanOneToMany;


/**
 * @author Rathesh Prabakar
 *
 */
public class OneToMany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		LoanOneToMany loan1 = new LoanOneToMany();
		loan1.setLid(1);
		loan1.setLoanName("Gold Loan");
		
		CustomerOneToMany cus1 = new CustomerOneToMany();
		cus1.setCid(101);
		cus1.setCustomerName("Rathesh");
		
		CustomerOneToMany cus2 = new CustomerOneToMany();
		cus2.setCid(102);
		cus2.setCustomerName("Rohan");
		
		CustomerOneToMany cus3 = new CustomerOneToMany();
		cus3.setCid(103);
		cus3.setCustomerName("Swetha");
		
		ArrayList<CustomerOneToMany> customerList = new ArrayList<CustomerOneToMany>();
		customerList.add(cus1);
		customerList.add(cus2);
		customerList.add(cus3);
		
		loan1.setCustomer(customerList);

		
		try {
			factory = Persistence.createEntityManagerFactory("map");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			
			transaction.begin();	
			manager.persist(loan1);
			transaction.commit();
			
			System.out.println("Added");
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}



	}

}
