/**
 * 
 */
package com.onebill.training.day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Rathesh Prabakar
 *
 */
public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("One", 1);
		h1.put("Two", 2);
		h1.put("Three", 3);
		
		Set<Map.Entry<String,Integer>> m1 = h1.entrySet();
		for (Entry<String,Integer> entry : m1) {
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
		}

		
	}

}
