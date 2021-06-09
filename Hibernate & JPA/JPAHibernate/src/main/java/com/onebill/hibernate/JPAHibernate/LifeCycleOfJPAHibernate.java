package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Movie;

public class LifeCycleOfJPAHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
	    EntityManager manager = entityManagerFactory.createEntityManager();
	    EntityTransaction transaction = manager.getTransaction();
	    
	    transaction.begin();
	    Movie m = manager.find(Movie.class,1);
	    System.out.println("Before Detach(): "+manager.contains(m));
	    
	    manager.detach(m);
	    System.out.println("After Detach() "+manager.contains(m));
	    
	    m.setMname("Raavan");
	    
	    manager.merge(m);
	    System.out.println("After Merge() "+manager.contains(m));

	    transaction.commit();

	}

}
