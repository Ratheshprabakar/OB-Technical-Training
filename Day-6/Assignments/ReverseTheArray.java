package com.onebill.training.day6.assignments;

public class ReverseTheArray {

	public static void main(String[] args) {
		int[] integerArray = {5,1,23,87,12,10};
		System.out.println("The Array elements before reversing");
		for (int i : integerArray) {
			System.out.println(i);
		}
		for(int i=0,j=integerArray.length-1;i<j;i++,j--)
		{
			integerArray[i]^=integerArray[j];
			integerArray[j]^=integerArray[i];
			integerArray[i]^=integerArray[j];
		}
		System.out.println("The Array elements after reversing");
		for (int i : integerArray) {
			System.out.println(i);
		}
	}

}
