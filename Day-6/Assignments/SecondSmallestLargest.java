/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh
 *
 */
public class SecondSmallestLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[5];
		Scanner input = new Scanner(System.in);
		int max=0,min=999,secondMax=0,secondMin=0;
		
		//Getting array elements
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i]=input.nextInt();
			//If to find the find the second maximum
			if(inputArray[i]>max)
			{
				secondMax= max;
				max=inputArray[i];
			}
			//if condition to find the second minimum
			if(inputArray[i]<min)
			{
				secondMin= min;
				min=inputArray[i];
			}
		}
		
		System.out.println("The Second Maximum element is "+secondMax);
		System.out.println("The Second Minimum element is "+secondMin);
		
		input.close();
	}

}
