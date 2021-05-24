/*
 @Class Name : SumOfOddNumbers
 @Description : Program to print the sum of first N odd Natural Numbers
 @Version 1.0 24/05/2021
 @Author : Rathesh Prabakar
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class SumOfOddNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the N value:\t");
		int N = input.nextInt();
		
		//Formula to calculate sum of first N odd numbers : N * N
		System.out.println("The sum of first "+N+" odd Numbers are "+ (int)(pow(N,2)));
		
		input.close();
	}

}
