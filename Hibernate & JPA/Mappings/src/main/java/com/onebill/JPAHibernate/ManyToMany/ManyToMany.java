/**
 * 
 */
package com.onebill.JPAHibernate.ManyToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.JPAHibernate.ManyToMany.bean.CustomerManyToMany;
import com.onebill.JPAHibernate.ManyToMany.bean.LoanManyToMany;

/**
 * @author Rathesh Prabakar
 *
 */
public class ManyToMany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		LoanManyToMany loan1 = new LoanManyToMany();
		loan1.setLid(1);
		loan1.setLoanName("Gold Loan");
		
		LoanManyToMany loan2 = new LoanManyToMany();
		loan2.setLid(2);
		loan2.setLoanName("Bike Loan");
		
		CustomerManyToMany cus1 = new CustomerManyToMany();
		cus1.setCid(101);
		cus1.setCustomerName("Rathesh");
		

		CustomerManyToMany cus2 = new CustomerManyToMany();
		cus2.setCid(102);
		cus2.setCustomerName("Karthik");
		
		ArrayList<LoanManyToMany> loanList = new ArrayList<LoanManyToMany>();
		loanList.add(loan1);
		loanList.add(loan2);
		
		cus1.setManyLoan(loanList);
		cus2.setManyLoan(loanList);
		
		ArrayList<CustomerManyToMany> customerList = new ArrayList<CustomerManyToMany>();
		customerList.add(cus1);
		customerList.add(cus2);
		
		loan1.setCustomers(customerList);
		loan2.setCustomers(customerList);
		
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
