package com.onebill.training.day6;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] integerArray = new int[3][];
		integerArray[0]= new int [] {1,2,6};
		integerArray[1]= new int [] {2,4};
		integerArray[2]= new int [] {5,10,15,20};
		
		for(int i=0;i<3;i++)
		{
			System.out.println(Arrays.toString(integerArray[i]));
		}

	}

}
