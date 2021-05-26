/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh
 *
 */
public class FindDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integerArray = new int[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input elements\t");
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i]=input.nextInt();	
		}
		
		System.out.println("The Duplicates elements are");
		//Logic to find duplicate elements in the input array
		for (int i = 0; i < integerArray.length; i++) {
			for (int j = i+1; j < integerArray.length; j++) {
				if (integerArray[i]==integerArray[j]) {
					System.out.println(integerArray[j]);
				}
			}
		}
		
		input.close();
		
		

	}

}
