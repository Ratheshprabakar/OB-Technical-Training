/**
 * 
 */
package com.onebill.hibernate.JPAHibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Rathesh Prabakar
 *
 */
public class DeleteARecordByDynamicQuery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
			String query = "delete from Movie where mid=:i";
			Query q = manager.createQuery(query);
			Scanner input = new Scanner(System.in);
			int inputNumber = input.nextInt();
			q.setParameter("i", inputNumber);
			int rowAffected = q.executeUpdate();
		transaction.commit();
		System.out.println("Row Affected "+rowAffected);
		
		input.close();

	}

}
