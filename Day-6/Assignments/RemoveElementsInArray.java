package com.onebill.training.day6.assignments;

import java.util.Scanner;

public class RemoveElementsInArray {

	public static void main(String[] args) {
		
		int[] integerArray = {1,2,7};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the position to delete");
		int inputPosition = input.nextInt();
		
		if(inputPosition >=0 & inputPosition <3) {
			integerArray[inputPosition-1]= -1;
			System.out.println("Element Deleted");
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
