/**
 * 
 */
package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Movie;

/**
 * @author Rathesh Prabakar
 *
 */
public class FindRecord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
	    EntityManager manager = entityManagerFactory.createEntityManager();
	    
	    Movie m = manager.find(Movie.class,1);
	    System.out.println(m.getMid());
	    System.out.println(m.getMname());
	    System.out.println(m.getMrating());
	    System.out.println(m.getMreview());
	    
	}

}
