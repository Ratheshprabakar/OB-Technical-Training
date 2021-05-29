package com.onebill.training.day9.assignments.javacollections;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.employeeId-o2.employeeId;
	}

}
