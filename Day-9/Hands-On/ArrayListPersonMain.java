/**
 * 
 */
package com.onebill.training.day9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rathesh Prabakar
 *
 */
public class ArrayListPersonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<ArrayListPerson> personList = new ArrayList<ArrayListPerson>();
		personList.add(new ArrayListPerson(101, "Rathesh"));
		personList.add(new ArrayListPerson(102, "Rohan"));
		personList.add(new ArrayListPerson(103, "Ram"));
		
		System.out.println("Before Sorting");
		for (ArrayListPerson arrayListPerson : personList) {
			System.out.println(arrayListPerson);
		}
		
		System.out.println("\nAfter Sorting");
		Collections.sort(personList);
		for (ArrayListPerson arrayListPerson : personList) {
			System.out.println(arrayListPerson);
		}
	}

}
