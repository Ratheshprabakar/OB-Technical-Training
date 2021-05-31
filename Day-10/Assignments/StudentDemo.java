/**
 * 
 */
package com.onebill.training.day10.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Rathesh Prabakar
 *
 */
class SortByName implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentName.compareTo(o2.studentName);
	}
}
class SortByRegisterNumber implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentId - o2.studentAge;
	}
}
class SortByAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentAge-o2.studentAge;
	}	
}
class SortByTotal implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.totalMark-o2.totalMark;
	}
	
}
public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ArrayList<Student> studentList =new ArrayList<>();
	     studentList.add(new Student(1718131, "Rathesh", 22, 1160));
	     studentList.add(new Student(1718128, "Praveen", 21, 1165));
	     studentList.add(new Student(1718148, "Ram", 21, 1198));
	     studentList.add(new Student(1718152, "Ravi", 22, 1095));
	     studentList.add(new Student(1718111, "Anuj", 21, 987));
	     studentList.add(new Student(1718115, "Hari", 21, 1004));
	     studentList.add(new Student(1718126, "Krishna", 18, 1087));
	     studentList.add(new Student(1718114, "Pradeep", 21, 1119));
	     studentList.add(new Student(1718142, "Dinesh", 19, 1150));
	     studentList.add(new Student(1718149, "Vimalan", 18, 1132));
	     
	     Scanner input  = new Scanner(System.in);
	     System.out.println("1) Sort by Name\n2) Sort by Register Number\n3) Sort by Age \n4) Sort by Total Mark\nEnter your choice");
	     int choice = input.nextInt();
	     
	     switch(choice) {
	     	
	     case 1:
	    	 Collections.sort(studentList, new SortByName());
	    	 break;
	     case 2:
	    	 Collections.sort(studentList, new SortByRegisterNumber());
	    	 break;
	     case 3:
	    	 Collections.sort(studentList, new SortByAge());
	    	 break;
	     case 4:
	    	 Collections.sort(studentList, new SortByTotal());
	    	 break;
	     }
	     
	     System.out.println("\nSorted List\n");
	     for (Student student : studentList) {
			System.out.println(student.getStudentId() + " "+ student.getStudentName()+" "+ student.getStudentAge()+" "+student.getTotalMark());;
		}
	     
	     input.close();
	}

}
