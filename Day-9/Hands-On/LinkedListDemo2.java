/**
 * 
 */
package com.onebill.training.day9;

import java.util.LinkedList;

/**
 * @author Rathesh Prabakar
 *
 */
public class LinkedListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> programmingLanguage = new LinkedList<String>();
		programmingLanguage.add("Java");
		programmingLanguage.add("Pythoh");
		programmingLanguage.add("C");
		programmingLanguage.add("Java Script");
		
		System.out.println(programmingLanguage);
		
		programmingLanguage.addLast("SQL");
		programmingLanguage.set(1, "Python");
		
		System.out.println(programmingLanguage);
	}

}
