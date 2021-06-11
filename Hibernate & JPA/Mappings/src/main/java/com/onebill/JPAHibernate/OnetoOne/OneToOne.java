package com.onebill.JPAHibernate.OnetoOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.JPAHibernate.OnetoOne.bean.CustomerOneToOne;
import com.onebill.JPAHibernate.OnetoOne.bean.LoanOneToOne;


public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		LoanOneToOne loan1 = new LoanOneToOne();
		loan1.setLid(1);
		loan1.setLoanName("Gold Loan");
		
		CustomerOneToOne cus1 = new CustomerOneToOne();
		cus1.setCid(101);
		cus1.setCustomerName("Rathesh");
		
		cus1.setLoan(loan1);
		
		try {
			factory = Persistence.createEntityManagerFactory("map");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			
			transaction.begin();	
			manager.persist(cus1);
			transaction.commit();
			
			System.out.println("Added");
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


	}

}
