/**
 * 
 */
package com.onebill.training.day9;

/**
 * @author Rathesh Prabakar
 *
 */
public class TreeSetStudent {
	int id;
	String studentName;
	String studentChar;
	public TreeSetStudent(int id, String studentName, String studentChar) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentChar = studentChar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentChar() {
		return studentChar;
	}
	public void setStudentChar(String studentChar) {
		this.studentChar = studentChar;
	}
	@Override
	public String toString() {
		return "TreeSetStudent [id=" + id + ", studentName=" + studentName + ", studentChar=" + studentChar + "]";
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	

}
