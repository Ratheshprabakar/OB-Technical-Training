package com.onebill.hibernate.EmployeeDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.bean.Employee;

/**
 * Hello world!
 *
 */
public class InsertByHibernate 
{
    public static void main( String[] args )
    {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Rathesh Prabakar");
        emp.setSalary(28908); 
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(emp);
        transaction.commit();
        System.out.println("Entered Successfully using Hibernate Core");
        
        session.close();
    }
}
