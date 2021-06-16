/**
 * 
 */
package com.onebill.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.Spring.bean.EmployeeInfo;
import com.onebill.Spring.dao.EmployeeDAO;

/**
 * @author rathesh
 *
 */
@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeDAO dao;
	
	public EmployeeInfo getEmp(int id) {
		if(id<0) {
			return null;
		}
		return dao.getEmp(id);
	}

	@Override
	public List<EmployeeInfo> getAllEmpData() {
		// TODO Auto-generated method stub
		return dao.getAllEmpData();
	}

	@Override
	public boolean addEmployee(EmployeeInfo employeeInfo) {
		// TODO Auto-generated method stub
		if(employeeInfo!=null)
		{
			return dao.addEmployee(employeeInfo);
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		if(id<0) {
			return false;
		}
		return dao.deleteEmployee(id);
	}

	@Override
	public boolean updateEmployee(EmployeeInfo employeeInfo) {
		
		if(employeeInfo!=null)
		{
			return dao.updateEmployee(employeeInfo);
		}
		return false;
	}

	
}
