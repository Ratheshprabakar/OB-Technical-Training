/*
 @ClassName : GenerateCubeSequence
 @Description : Program to print the cube of the number starting from 1.
 @Version 1.0 24/05/2021
 @Author : Rathesh Prabakar
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class GenerateCubeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of N\t");
		int N = input.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println("The Cube of "+i+" is "+(int)pow(i,3));
		}
		
		input.close();
		

	}

}
