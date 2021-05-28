/**
 * 
 */
package com.onebill.training.day9;

import java.util.LinkedList;

/**
 * @author Rathesh Prabakar
 *
 */
public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		
		System.out.println("---- Add with Index ----");
		list1.add(0, 10);
		System.out.println(list1);
		
		System.out.println("--- remove ---");
		list1.remove(); // remove element from front by default
		System.out.println(list1);
		list1.remove(2);
		System.out.println(list1);
		
		list1.set(1,10);
		System.out.println(list1);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(10);
		System.out.println("Contains All demo");
		System.out.println(list1.containsAll(list2));
		
		list2.addFirst(0);
		list2.addLast(20);
		System.out.println(list2);
		

	}

}
