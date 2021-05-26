/**
 * 
 */
package com.onebill.training.day6.assignments;

/**
 * @author rathesh
 *
 */
public class MatrixMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int matrix1[][]= {    
	    		 {5,2,3},             // 3x3
	    		 {7,9,1},
	    		 {6,2,3}};
	     int matrix2[][]= {
	    		 {8,2,1},              // 3x3
	    		 {5,1,1},
	    		 {4,2,7} };
	     
	     int rowLength =matrix1.length;
	     int columnLength=matrix2.length;
	     int resultMatrix[][]=new int[rowLength][columnLength];
	     System.out.println("Matrix Multiplication: ");
	     for(int i=0;i<rowLength;i++) {
	    	 for(int j=0;j<columnLength;j++) {
	    		       
	    		 for(int k=0;k<rowLength;k++)      
	    		 {      
	    		 resultMatrix[i][j]+=matrix1[i][k]*matrix2[k][j];      
	    		 }
	    		 System.out.print(resultMatrix[i][j]+" ");  
	    	 }
	    	 System.out.println();
	      }
	   }
	}

