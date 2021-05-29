/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.Comparator;

/**
 * @author Rathesh Prabakar
 *
 */
public class SortByEmployeeName  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	

}
