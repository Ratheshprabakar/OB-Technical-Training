package com.onebill.Spring.SpringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.Spring.bean.EmployeeBean;

public class EmployeeMainWithDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("importAllConfig.xml");
		
		EmployeeBean e = (EmployeeBean) context.getBean("employee");
		
		System.out.println("Name "+ e.getEmployeeName());
		System.out.println("Age "+ e.getEmployeeAge());
		System.out.println("Department Id "+e.getDepartment().getDepartmentId());
		System.out.println("Department Name "+e.getDepartment().getDeptname());

	}

}
