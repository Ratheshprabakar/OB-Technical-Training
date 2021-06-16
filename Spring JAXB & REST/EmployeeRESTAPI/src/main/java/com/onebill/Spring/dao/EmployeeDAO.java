package com.onebill.Spring.dao;

import java.util.List;

import com.onebill.Spring.bean.EmployeeInfo;

public interface EmployeeDAO {
	
	public EmployeeInfo getEmp(int id);
	
	public List<EmployeeInfo> getAllEmpData();
	
	public boolean addEmployee(EmployeeInfo employeeInfo);
	
	public boolean deleteEmployee(int id);
	
	public boolean updateEmployee(EmployeeInfo employeeInfo);


	
}
