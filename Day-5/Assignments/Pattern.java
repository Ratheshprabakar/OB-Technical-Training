/*
 @Class Name : Pattern
 @Description : Program to print the pattern
      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5 
 @Version 1.0 24/05/2021
 @Author : Rathesh Prabakar
*/

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int value = 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N - i; j++) {
				// for left spacing
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				// Printing Value
				System.out.print(value+" ");
			}
			value++;
			// for newline
			System.out.println();
		}
		
		input.close();
	}

}
