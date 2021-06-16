package com.onebill.Spring.service;

import java.util.List;

import com.onebill.Spring.bean.EmployeeInfo;

public interface EmployeeService {
	
	public EmployeeInfo getEmp(int id);
	
	public List<EmployeeInfo> getAllEmpData();
	
	public boolean addEmployee(EmployeeInfo employeeInfo);
	
	public boolean deleteEmployee(int id);
	
	public boolean updateEmployee(EmployeeInfo employeeInfo);

}
