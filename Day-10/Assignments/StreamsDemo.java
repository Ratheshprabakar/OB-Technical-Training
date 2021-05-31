/**
 * 
 */
package com.onebill.training.day10.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rathesh Prabakar
 *
 */
public class StreamsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(50,81,99,25,47,9);
		
		// forEach 
		System.out.print("\nList :");
		list.stream().forEach(i ->System.out.print(i+" "));
		
		// filter which is divisible by 3 and provide sum of it
		System.out.println("\nFilter and Reduce");
		System.out.println(list.stream().filter(i ->i%3 ==0).reduce((a,b) -> a+b).get());
		
		// Multiply 2 to each value in the list and printing - using forEach
		System.out.println("\nMap, Collect  and forEach");
		list.stream().map(i -> i*2).collect(Collectors.toList()).forEach(System.out::println);
	    
	    System.out.println("List  with values greater than 40");
	    System.out.println(list.stream().filter(i -> i>40).collect(Collectors.toList()));
	    
	    System.out.println("Max of List");
	    System.out.println(list.stream().max((i,j) -> i.compareTo(j)).get());
	    
	    System.out.println("Min of  list");
	    System.out.println(list.stream().min((i,j) -> i.compareTo(j)).get());

	}

}
