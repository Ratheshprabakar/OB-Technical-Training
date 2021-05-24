/*
 @ClassName : FloydsTriangle
 @Description : Program to print Floyd's triangle
 if N = 5

 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 @Version 1.0 24/05/2021
 @Author : Rathesh Prabakar
*/

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int value = 1;
		
		for(int i= 0;i<=N;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(value +"  ");
				value++;
			}
			System.out.println();
		}
		
		input.close();
		
	}

}
