package com.onebill.hibernate.JPAHibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Movie;

public class ReadARecordByDynamicQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String query = "from Movie where mid=: movieid";
		
		Query q = entityManager.createQuery(query);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		q.setParameter("movieid", n);
		
		Movie m = (Movie) q.getSingleResult();
		System.out.println(m.getMname());
		System.out.println(m.getMrating());
		System.out.println(m.getMreview());
		
		input.close();
		

	}

}
