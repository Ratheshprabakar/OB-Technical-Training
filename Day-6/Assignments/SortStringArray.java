package com.onebill.training.day6.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray {

	public static void main(String[] args) {
		String[] stringArray= new String[3];
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0;i<3;i++) {
			stringArray[i] = input.nextLine();
		}
		
		System.out.println("Array Before Sorting");
		for (String i : stringArray) {
			System.out.println(i);
		}
		
		Arrays.sort(stringArray);
		
		System.out.println("Array After Sorting");
		for (String i : stringArray) {
			System.out.println(i);
		}
		
		input.close();
	}

}
