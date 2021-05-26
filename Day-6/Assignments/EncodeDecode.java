/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh prabakar
 *
 */
public class EncodeDecode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String inputString =input.nextLine();
		
		//Encoding the string 
		for(int i=0;i<inputString.length();i++)
		{
			if(!(inputString.charAt(i)==' '))
				System.out.print((inputString.toLowerCase().charAt(i))%97);
			else
				System.out.print("99");
		}
		
		input.close();
		
	}

}
