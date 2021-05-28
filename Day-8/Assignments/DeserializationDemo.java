/**
 * 
 */
package com.onebill.training.day8.assignments;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Rathesh Prabakar
 *
 */
public class DeserializationDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin = new FileInputStream("/home/rathesh/Desktop/serialize.txt");
		// passing file to object
		ObjectInputStream obj = new ObjectInputStream(fin);
		Student s1 = (Student) obj.readObject(); 
		System.out.println("Student Data : \n Reg_no : " + s1.registerNumber + " Name : " + s1.studentName);

		fin.close(); // close the input stream
		System.out.println("Success!");
	}

}
