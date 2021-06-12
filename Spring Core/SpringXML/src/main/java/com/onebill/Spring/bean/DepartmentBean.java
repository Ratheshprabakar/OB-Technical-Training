/**
 * 
 */
package com.onebill.Spring.bean;

/**
 * @author rathesh
 *
 */
public class DepartmentBean {
	private int departmentId;
	private String deptname;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public DepartmentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentBean(int departmentId, String deptname) {
		super();
		this.departmentId = departmentId;
		this.deptname = deptname;
	}
	
	

}
