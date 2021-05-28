/**
 * 
 */
package com.onebill.training.day9;

/**
 * @author Rathesh Prabakar
 *
 */
public class TreeMapEmployee {
	int employeeId;
	String employeeName;
	public TreeMapEmployee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "TreeMapEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	

}
