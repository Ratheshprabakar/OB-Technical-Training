package com.onebill.hibernate.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Movie m = new Movie();
        m.setMid(1);
        m.setMname("SP");
        m.setMrating(9.2);
        m.setMreview("Good");
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Movie");
        
        EntityManager manager = entityManagerFactory.createEntityManager();
        
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(m);
        transaction.commit();
        
        System.out.println("Saved");
        
    }
}
