/**
 * 
 */
package com.onebill.training.day8.assignments;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Student implements Serializable {
	int registerNumber;
	String studentName;

	public Student(int registerNumber, String studentName) {
		super();
		this.registerNumber = registerNumber;
		this.studentName = studentName;
	}

}

public class Serialization {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(1718131, "Rathesh P");
	
		FileOutputStream fout = new FileOutputStream("/home/rathesh/Desktop/serialize.txt");	
		ObjectOutputStream obj = new ObjectOutputStream(fout);
		obj.writeObject(s1); 
		obj.flush(); 
		obj.close(); 

	}

}
