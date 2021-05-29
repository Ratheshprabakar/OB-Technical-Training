/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Rathesh Prabakar
 *
 */
public class LinkedHashMapCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Customers, Integer> cust = new LinkedHashMap<Customers,Integer>();
		
		cust.put(new Customers(101, "Rathesh"), 1);
		cust.put(new Customers(102, "Rahul"), 3);
		cust.put(new Customers(104, "Albino"), 2);
		cust.put(new Customers(105, "Cristiano"), 4);
		cust.put(new Customers(107, "Tamil"), 5);
		
		Set<Map.Entry<Customers,Integer>> m1 =cust.entrySet();
	     
	     System.out.println("Before Sorting:\n");
	     for(Entry<Customers,Integer> val :m1) {        //getting key 
	    	 System.out.println(val.getKey());
	     }
	     
	     System.out.println("\nAfter Sorting:\n");
	     TreeMap<Customers,Integer> treemap =new TreeMap<>(cust);
	     
	     Set<Map.Entry<Customers, Integer>> m2 =treemap.entrySet();
	     
	     for(Entry<Customers,Integer> val :m2) {        
	    	 System.out.println(val.getKey());
	     }
		

	}

}
