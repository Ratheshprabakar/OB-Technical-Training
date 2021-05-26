package com.onebill.training.day6;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integerArray = {1,2,3,4,5,6,7,8,9};
		int sum=0,forEachSum=0;
		double average,forEachAverage;
		
		for(int i=0;i<9;i++)
		{
			sum+=integerArray[i];
		}
		average = sum/integerArray.length;
		
		for (int i : integerArray) {
			forEachSum+=i;
		}
		forEachAverage = forEachSum/integerArray.length;

		System.out.println(forEachSum + " " +forEachAverage);
	}

}
