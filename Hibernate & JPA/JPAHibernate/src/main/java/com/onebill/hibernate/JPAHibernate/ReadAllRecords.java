/**
 * 
 */
package com.onebill.hibernate.JPAHibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Movie;

/**
 * @author Rathesh Prabakar
 *
 */
public class ReadAllRecords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
	    EntityManager manager = entityManagerFactory.createEntityManager();
	    
	    String query = "from Movie";
	    
	    Query q = manager.createQuery(query);
	    List<Movie> l = q.getResultList();
	    for (Movie m : l) {
	    	System.out.println(m.getMid());
		    System.out.println(m.getMname());
		    System.out.println(m.getMrating());
		    System.out.println(m.getMreview());
		    System.out.println("--------------------------");
		}

	}

}
