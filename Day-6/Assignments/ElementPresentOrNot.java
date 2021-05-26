/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh
 *
 */
public class ElementPresentOrNot {

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
		
		System.out.println("Enter the element to search\t");
		int searchElement = input.nextInt();
		
		for (int i : integerArray) {
			if(i==searchElement) {
				System.out.println("Element Present");
				System.exit(0);
			}
		}
		System.out.println("Element not present");
		input.close();
	}

}
