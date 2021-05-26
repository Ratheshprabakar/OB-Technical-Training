/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh
 *
 */
public class SumPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integerArray = new int[15];
		int sumValue = 10;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input elements\t");
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i]=input.nextInt();	
		}
		
		for (int i = 0; i < integerArray.length; i++) {
			if(!(integerArray[i]>sumValue)) {
				int searchPair = Math.abs(sumValue-integerArray[i]);
				for (int j = 0; j < integerArray.length; j++) {
					if(integerArray[j]==searchPair)
					{
						System.out.println("("+integerArray[i]+","+integerArray[j]+")");
					}
				}
			}
		}
		
		input.close();
	}

}
