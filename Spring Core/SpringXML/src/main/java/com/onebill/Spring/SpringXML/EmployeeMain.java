package com.onebill.Spring.SpringXML;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.Spring.bean.EmployeeBean;

public class EmployeeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext obj =  new ClassPathXmlApplicationContext("employeeConfig.xml");
		EmployeeBean emp1 = (EmployeeBean) obj.getBean("employee");
		EmployeeBean emp2 = (EmployeeBean) obj.getBean("employee");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name ");
		emp1.setEmployeeName(input.next());
		System.out.println("Enter the age ");
		emp1.setEmployeeAge(input.next());
		
		System.out.println("Enter the name ");
		emp2.setEmployeeName(input.next());
		System.out.println("Enter the age ");
		emp2.setEmployeeAge(input.next());
		
		System.out.println(emp1.getEmployeeName());
		System.out.println(emp1.getEmployeeAge());
		
		System.out.println(emp2.getEmployeeName());
		System.out.println(emp2.getEmployeeAge());


	}

}
