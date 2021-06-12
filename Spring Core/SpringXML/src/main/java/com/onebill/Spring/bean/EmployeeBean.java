package com.onebill.Spring.bean;

public class EmployeeBean {
	
	private String employeeName;
	private String employeeAge;
	private DepartmentBean department;
	
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public DepartmentBean getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentBean department) {
		this.department = department;
	}

	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBean(String employeeName, String employeeAge, DepartmentBean department) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.department = department;
	}

	
	
}
