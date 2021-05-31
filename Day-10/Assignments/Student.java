/**
 * 
 */
package com.onebill.training.day10.assignments;

/**
 * @author Rathesh Prabakar
 *
 */
public class Student {
	int studentId;
	String studentName;
	int studentAge;
	int totalMark;
	public Student(int studentId, String studentName, int studentAge, int totalMark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.totalMark = totalMark;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public int getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", totalMark=" + totalMark + "]";
	}
	
	

}
