package com.onebill.hibernate.JPAHibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateARecordByDynamicQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Movie");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		String query = "update Movie set mname=:newName, mreview=:newReview where mid=:id";
		Query q = manager.createQuery(query);
		
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		String newName = input.next();
		String newReview = input.next();
		
		q.setParameter("newName", newName);
		q.setParameter("newReview", newReview);
		q.setParameter("id", id);
		
		int count = q.executeUpdate();
		transaction.commit();
		System.out.println("Rows affected "+ count);
		
		input.close();

	}

}
