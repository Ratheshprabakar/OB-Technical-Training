/** @Class : LinkedHashSetWrapper
 * 
 *  @Description : LinkedHashSet is the extension version of HashSet.
 *  The only difference is it maintains the insertion order.
 *  When iterating through a HashSet the order is unpredictable,
 *  while a LinkedHashSet lets us iterate through the elements
 *  in the order in which they were inserted.
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Rathesh Prabakar
 *
 */
public class LinkedHashSetWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10); // To add an element
		lhs.add(90);
		lhs.add(1500);
		lhs.add(50);
		System.out.println(lhs);
		
		lhs.remove((Integer)10); // To remove an element
		System.out.println(lhs);
		
		System.out.print("Printing size of the LinkedHashSet\t");
		System.out.println(lhs.size());
		
		//Iterating through For Each
		System.out.println("Iterating through For Each");
		for (Integer integer : lhs) {
			System.out.println(integer);
		}
		
		//Iterating using Iterator
		System.out.println("Iterating using Iterator");
		Iterator<Integer> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*To sort LinkedHashSet
		 *  - Convert into ArrayList and sort using Collections.sort()
		 *  - Convert into TreeSet, since by default it is sorted in nature
		 */
		ArrayList<Integer> tempList = new ArrayList<Integer>(lhs);
		
		Collections.sort(tempList); // Ascending
		System.out.println("Ascending Order Sort");
		System.out.println(tempList);
		
		Collections.sort(tempList,Collections.reverseOrder());
		System.out.println("Descending Order Sort");
		System.out.println(tempList);
	}
}
