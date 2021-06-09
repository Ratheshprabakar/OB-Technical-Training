package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Movie;

public class DeleteParticularRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
	    EntityManager manager = entityManagerFactory.createEntityManager();
	    EntityTransaction transaction = manager.getTransaction();
	    
	    transaction.begin();
	    Movie m = manager.find(Movie.class, 2);
	    manager.remove(m);
	    transaction.commit();
	    System.out.println("Record Deleted Successfully");
	
	}

}
