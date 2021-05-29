/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.Collections;
import java.util.Vector;

/**
 * @author Rathesh Prabakar
 *
 */
public class VectorWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> integerVector = new Vector<Integer>();
		
		integerVector.add(10);
		integerVector.add(20);
		integerVector.add(30);
		System.out.println(integerVector); //[10,20,30]
		
		integerVector.add(1, 15);
		System.out.println(integerVector); //[10,15,20,30]
		
		System.out.println("Capacity "+ integerVector.capacity()); // By Default 10
		
		System.out.println(integerVector.elementAt(2)); // Returns element at particular index
		
		System.out.println(integerVector.get(2)); // Similar to elementAt()
		
		System.out.println("Index of 20 is "+integerVector.indexOf((Integer)30)); // Returns the index of particular element
		
		integerVector.remove(0); // Remove element at particular index
		System.out.println(integerVector);
		
		System.out.println(integerVector.lastElement()); // Returns the last element in vector
		
		integerVector.removeElement((Integer)20);
		System.out.println(integerVector);
		
		integerVector.set(1, 90);
		System.out.println(integerVector);
		
		integerVector.add(30);
		integerVector.add(100);
		integerVector.add(10);
		System.out.println(integerVector);
		
		System.out.println("\nAscending Order");
		Collections.sort(integerVector); // Ascending Sorting
		System.out.println(integerVector);
		
		System.out.println("\nDescending Order");
		Collections.sort(integerVector,Collections.reverseOrder());
		System.out.println(integerVector);
	}

}
