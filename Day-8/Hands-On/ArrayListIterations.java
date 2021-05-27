/**
 * @Description : Demonstrated the different types of array list iterations
 */
package com.onebill.training.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Rathesh Prabakar
 *
 */
public class ArrayListIterations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		System.out.println("Using For Loop");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("Using For Each loop");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
		System.out.println("Using Iterable interface");
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Using List Iterator");
		ListIterator<Integer> listIterator = arrayList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("Using List Iterator (Reverse)");
		ListIterator<Integer> listIterator1 = arrayList.listIterator(arrayList.size());
		while(listIterator1.hasPrevious()) {
			System.out.println(listIterator1.previous());
		}
	}

}
