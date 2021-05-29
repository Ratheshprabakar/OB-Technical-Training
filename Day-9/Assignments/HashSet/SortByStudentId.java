/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.Comparator;

/**
 * @author Rathesh Prabakar
 *
 */
public class SortByStudentId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentName.compareTo(o2.studentName);
	}

}
