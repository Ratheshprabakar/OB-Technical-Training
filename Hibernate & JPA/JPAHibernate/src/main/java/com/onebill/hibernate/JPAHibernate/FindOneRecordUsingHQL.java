package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Movie;

public class FindOneRecordUsingHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
			    EntityManager manager = entityManagerFactory.createEntityManager();
			    
			    String query = "from Movie where mid=2";
			    
			    Query q = manager.createQuery(query);
			    Movie m = (Movie) q.getSingleResult();
		    	System.out.println(m.getMid());
			    System.out.println(m.getMname());
			    System.out.println(m.getMrating());
			    System.out.println(m.getMreview());
			    System.out.println("--------------------------");
	}

}
