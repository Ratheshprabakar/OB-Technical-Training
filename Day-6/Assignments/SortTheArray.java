/**
 * Program to sort the integer array
 */
package com.onebill.training.day6.assignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rathesh
 *
 */
public class SortTheArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integerArray= new int[10];
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0;i<10;i++) {
			integerArray[i] = input.nextInt();
		}
		
		System.out.println("Array Before Sorting");
		for (int i : integerArray) {
			System.out.println(i);
		}
		
		Arrays.sort(integerArray);
		
		System.out.println("Array After Sorting");
		for (int i : integerArray) {
			System.out.println(i);
		}
		
		input.close();
	}

}
