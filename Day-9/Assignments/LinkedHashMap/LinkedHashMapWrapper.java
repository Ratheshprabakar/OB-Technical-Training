/**
 * 
 */
package com.onebill.training.day9.assignments.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Rathesh Prabakar
 *
 */
public class LinkedHashMapWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(3, "a");
	    lhm.put(2, "is");
	    lhm.put(1, "Rathesh");
	    lhm.put(4, "good");
	    lhm.put(5, "boy");

	    
	    //iterating
	    Set<Map.Entry<Integer,String>> lhm1 =lhm.entrySet();
	    
	    for(Entry<Integer,String> entry: lhm1) {
	  	  System.out.print(entry.getKey()+" : ");   // getKey() - to get keys
	  	  System.out.println(entry.getValue());
		}
	    
	    //To sort linkedinhashmap we need to convert into arraylist to use Collections.sort() method
	    List<Map.Entry<Integer,String>> lhm2 = new ArrayList<Map.Entry<Integer,String>>(lhm1);
	    
	    Collections.sort(lhm2, new Comparator<Map.Entry<Integer,String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey()-o2.getKey();
			}
	    	
	    });
	    System.out.println("\nAfter sorting");
	    for(Entry<Integer,String> entry: lhm2) {
		  	  System.out.print(entry.getKey()+" : ");   // getKey() - to get keys
		  	  System.out.println(entry.getValue());
			}
	}

}
