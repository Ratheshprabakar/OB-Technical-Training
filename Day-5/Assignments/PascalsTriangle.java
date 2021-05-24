/*
 @Class Name : PascalsTriangle
 @Description : Program to print pascal triangle. Here I used nCr formula to generate this pattern.

       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
 
 @Version 1.0 24/05/2021
 @Author : Rathesh Prabakar
*/


import java.util.Scanner;

public class PascalsTriangle {

	public static int factorial(int i)
	{
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N - i; j++) {
				// for left spacing
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				// nCr formula
				System.out.print(" "+ factorial(i)/ (factorial(i - j)* factorial(j)));
			}
			// for newline
			System.out.println();
		}
		
		input.close();
	}
}
