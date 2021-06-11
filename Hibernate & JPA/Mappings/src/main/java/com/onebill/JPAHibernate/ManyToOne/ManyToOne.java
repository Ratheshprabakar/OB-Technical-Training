package com.onebill.JPAHibernate.ManyToOne;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.JPAHibernate.ManyToOne.bean.CustomerManyToOne;
import com.onebill.JPAHibernate.ManyToOne.bean.LoanManyToOne;


public class ManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		LoanManyToOne loan1 = new LoanManyToOne();
		loan1.setLid(1);
		loan1.setLoanName("Gold Loan");

		LoanManyToOne loan2 = new LoanManyToOne();
		loan2.setLid(2);
		loan2.setLoanName("Bike Loan");
		
		CustomerManyToOne cus1 = new CustomerManyToOne();
		cus1.setCid(101);
		cus1.setCustomerName("Rathesh");
		
		loan1.setCustomerManyToMany(cus1);
		loan2.setCustomerManyToMany(cus1);
		
		ArrayList<LoanManyToOne> loanList = new ArrayList<LoanManyToOne>();
		loanList.add(loan1);
		loanList.add(loan2);
		
		cus1.setLoanManyToOne(loanList);
		
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
