/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh prabakar
 *
 */
public class FindSequenceInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the input string\t");
		String inputString = input.next();
		
		System.out.println("Entet the Char Sequence you want to search");
		String charSequence = input.next();
		
		if(inputString.contains(charSequence))
			System.out.println("Yes the sequence is present in the given string");
		else
			System.out.println("No the sequence is not present in the given string");

		input.close();
	}

}
