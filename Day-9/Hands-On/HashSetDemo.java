/**
 * 
 */
package com.onebill.training.day9;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Rathesh Prabakar
 *
 */
public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(200);
		hs.remove(200);
		System.out.println(hs);
		
		Iterator<Integer> iterator = hs.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}
