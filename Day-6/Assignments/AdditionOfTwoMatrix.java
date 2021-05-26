/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rathesh
 *
 */
public class AdditionOfTwoMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		
		//Input for Matrix 1
		System.out.println("Enter the elements for first matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix1[i][j]=input.nextInt();
			}
		}
		//Input for Matrix 2
		System.out.println("Enter the elements for second matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix2[i][j]=input.nextInt();
			}
		}
		
		System.out.println("\nThe Matrix 1 \n");
		//Print Matrix 1
		for (int[] is : matrix1) {
			System.out.print(Arrays.toString(is)+"\n");
		}
		
		System.out.println("\nThe Matrix 2 \n");
		//Print Matrix 2
		for (int[] is : matrix2) {
			System.out.println(Arrays.toString(is));
		}
		//Addition of two matrixes
		System.out.println("\nThe Addition of two matrixes are");
		for (int i = 0; i < 3; i++) {
			System.out.print("[");
			for (int j = 0; j < 3; j++) {
				System.out.print((matrix1[i][j]+matrix2[i][j])+ ", ");
			}
			System.out.print("]");
			System.out.println();
		}
		input.close();
	}

}
