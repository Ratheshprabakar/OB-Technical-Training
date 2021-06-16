package com.onebill.Spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.onebill.Spring.bean.EmployeeInfo;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {
	
	public EmployeeInfo getEmp(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		
		EmployeeInfo employeeInfo =	manager.find(EmployeeInfo.class,id);
		manager.close();
		factory.close();
		
		return employeeInfo;
	}

	@Override
	public List<EmployeeInfo> getAllEmpData() {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		
		String query = "from EmployeeInfo";
		Query q = manager.createQuery(query);
		
		List<EmployeeInfo> employeeInfos = q.getResultList();
		manager.close();
		factory.close();
		
		return employeeInfos;
	}

	@Override
	public boolean addEmployee(EmployeeInfo employeeInfo) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(employeeInfo);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			EmployeeInfo employee = manager.find(EmployeeInfo.class, id);
			manager.remove(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployee(EmployeeInfo employeeInfo) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ems");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			EmployeeInfo originalData = manager.find(EmployeeInfo.class, employeeInfo.getEmpid());
			
			originalData.setName(employeeInfo.getName());
			originalData.setPwd(employeeInfo.getPwd());
			originalData.setDob(employeeInfo.getDob());
			
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
