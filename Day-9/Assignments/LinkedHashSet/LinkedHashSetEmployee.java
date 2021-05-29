/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author Rathesh Prabakar
 *
 */
public class LinkedHashSetEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Employee> employeeList = new LinkedHashSet<Employee>();
		employeeList.add(new Employee(105, "Albin"));
		employeeList.add(new Employee(102, "Rohan"));
		employeeList.add(new Employee(110, "Bala"));
		
		for (Employee employee : employeeList) {
			System.out.println(employee.getEmployeeName());
		}
		
		/*To sort LinkedHashSet for User defined set, we need to convert into 
		 * TreeSet to use Comparator
		 * */
		TreeSet<Employee> tempListForId = new TreeSet<Employee>(new SortByEmployeeId());
		tempListForId.addAll(employeeList);
		
		System.out.println("The Sorted Employee LinkedHashSet using TreeSet by Employee ID");
		for (Employee employee : tempListForId) {
			System.out.println(employee.getEmployeeId() +" "+ employee.getEmployeeName());
		}
		
		//Sort by Employee Name
		TreeSet<Employee> tempListForName = new TreeSet<Employee>(new SortByEmployeeName());
		tempListForName.addAll(employeeList);
		
		System.out.println("The Sorted Employee LinkedHashSet using TreeSet by Employee Name");
		for (Employee employee : tempListForName) {
			System.out.println(employee.getEmployeeId() +" "+ employee.getEmployeeName());
		}

	}

}
