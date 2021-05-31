/**
 * 
 */
package com.onebill.training.day10;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rathesh Prabakar
 *
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		System.out.println("For Each Using Lambda Expression");
		values.forEach(i->System.out.println(i));
		
		System.out.println("For Each using system.out::println");
		values.forEach(System.out::println);

	}

}
