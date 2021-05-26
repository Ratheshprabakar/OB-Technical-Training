/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Arrays;

/**
 * @author rathesh
 *
 */
public class ArrayReference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = num1;
		
		//Before modification
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		//Modifiying the value in num2 array
		num2[3]=99;
		
		//After Modification
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
	}

}
