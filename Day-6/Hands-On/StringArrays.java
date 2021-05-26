package com.onebill.training.day6;

public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sample = {"This","is","a","test"};
		System.out.println("Original Array");
		
		for (String string : sample) {
			System.out.print(string + " ");
		}
		System.out.println();
		sample[2]="was";
		sample[3]=sample[3].concat(" too!");
		
		for (String string : sample) {
			System.out.print(string + " ");
		}

	}

}
