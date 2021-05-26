package com.onebill.training.day6;

public class ArrayInitializationDemo {

	public static void main(String[] args) {
		int[] integerArray = new int[3];
		int min,max;
		integerArray[0]=87;
		integerArray[1]=4;
		integerArray[2]=999;
		
		min=integerArray[0];
		max=integerArray[1];
		
		for(int i=0;i<=2;i++)
		{
			if(integerArray[i]<min)
				min=integerArray[i];
			if(integerArray[i]>max)
				max=integerArray[i];
		}
		System.out.println("Max and Min element are"+min+" "+max);
		
	}

}
