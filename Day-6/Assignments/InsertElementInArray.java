package com.onebill.training.day6.assignments;

import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
		int[] integerArray = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the position to insert");
		int inputPosition = input.nextInt();
		
		System.out.println("Enter the element want to insert");
		int inputElement = input.nextInt();
		
		if(inputPosition >=0 & inputPosition <10) {
			integerArray[inputPosition-1]= inputElement;
		}
		else
		{
			System.out.println("Please enter valid position");
			System.exit(0);
		}
		System.out.println("The Array Elements are");
		for (int i : integerArray) {
			System.out.println(i);
		}
		
		
		input.close();
	}

}
