/**
 * 
 */
package com.onebill.training.day9;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Rathesh Prabakar
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integerArray = new ArrayList<Integer>();
		integerArray.add(10);
		integerArray.add(20);
		integerArray.add(2,30);
		integerArray.add(3,40);
		integerArray.add(90);
		System.out.println(integerArray);
		
		integerArray.set(3, 50);
		
		List<Integer> SubList = integerArray.subList(1,3);
		
		System.out.println(SubList);
		

	}

}
