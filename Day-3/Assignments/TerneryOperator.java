/*
 @Class Name : TerneryOperator
 @Description : Program to find whether the number is odd or even using Ternary operator
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

import java.util.Scanner;

public class TerneryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number\t");
		int inputNumber = input.nextInt();
		
		String result = (inputNumber%2==0)?"Even Number":"Odd Number";
		System.out.println(result);
		
		input.close();
	}

}
