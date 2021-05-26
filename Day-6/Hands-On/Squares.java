package com.onebill.training.day6;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] SquaresArray = new int[11][2];
		
		for(int i=1;i<=10;i++)
		{
				SquaresArray[i][0]=i;
				SquaresArray[i][1]=i*i;
		}
		for(int i=1;i<=10;i++)
		{
			for(int j=0;j<2;j++) {
				System.out.print(SquaresArray[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
