/**
 * 
 */
package com.onebill.training.day9;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Rathesh Prabakar
 *
 */
public class TreeMapEmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By Rule we should implement either Comparable or comparator to the treemap
		TreeMap<TreeMapEmployee,Integer> tm = new TreeMap<TreeMapEmployee, Integer>(new SortByEmployeeId());
		tm.put(new TreeMapEmployee(101, "Rathesh"), 30);
		tm.put(new TreeMapEmployee(102, "Yathi"), 20);
		tm.put(new TreeMapEmployee(107, "Ash"), 10);
		
		Set<Map.Entry<TreeMapEmployee,Integer>>  ts = tm.entrySet();
		for (Entry<TreeMapEmployee, Integer> entry : ts) {
			System.out.println(entry);
		}
	}

}
