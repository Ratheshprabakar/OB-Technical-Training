package com.onebill.hibernate.HibernateCoreDemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.bean.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User u = new User();
        u.setUid(1);
        u.setUname("rathesh");
        u.setPwd("1234");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
        
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(u);
        transaction.commit();
        System.out.println("Entered Successfully");
        
        session.close();
        
        
    }
}
