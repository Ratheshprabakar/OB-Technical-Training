/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Rathesh Prabakar
 *
 */
public class HashSetStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> studentHashSet = new HashSet<Student>();
		
		studentHashSet.add(new Student(1718131, "Rathesh", 22));
		studentHashSet.add(new Student(1718129, "Praveen", 22));
		studentHashSet.add(new Student(1718151, "Arun", 22));
		studentHashSet.add(new Student(1718147, "Swathi", 22));
		studentHashSet.add(new Student(1718115, "Jeeva", 21));

		Iterator<Student> itr = studentHashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Sorting based on Id
		TreeSet<Student> tempListForId = new TreeSet<Student>(new SortByStudentId());
		tempListForId.addAll(studentHashSet);
		
		System.out.println("\nThe Sorted Student Database(Based on StudentId)");
		for (Student student : tempListForId) {
			System.out.println(student.getStudentId() +" "+student.getStudentName()+" "+student.getStudentAge());
		}
		
		//Sorting based on Name
		TreeSet<Student> tempListForName = new TreeSet<Student>(new SortByStudentName());
		tempListForName.addAll(studentHashSet);
		
		System.out.println("\nThe Sorted Student Database(Based on Student Name)");
		for (Student student : tempListForName) {
			System.out.println(student.getStudentId() +" "+student.getStudentName()+" "+student.getStudentAge());
		}
	}

}
