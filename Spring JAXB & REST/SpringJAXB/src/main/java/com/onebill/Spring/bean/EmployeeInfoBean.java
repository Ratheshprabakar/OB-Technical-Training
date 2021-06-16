package com.onebill.Spring.bean;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@SuppressWarnings("serial")
@XmlRootElement(name = "employee-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeInfoBean implements Serializable {

	@XmlElement(name = "emp-id")
	private int empId;
	@XmlElement
	private String name;
	@XmlElement(name = "phone")
	private long mobileNumber;
	@XmlElement(name = "email-id")
	private String emailId;
	@XmlElement
	private Date dob;
	@XmlElement
	private Date doj;
	@XmlElement(name = "department-id")
	private int departmentId;
	@XmlTransient //To hide this field in XML
	private int salary;
	@XmlElement
	private int mid;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "EmployeeInfoBean [empId=" + empId + ", name=" + name + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + ", dob=" + dob + ", doj=" + doj + ", departmentId=" + departmentId + ", salary=" + salary
				+ ", mid=" + mid + "]";
	}

}
