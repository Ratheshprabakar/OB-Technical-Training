package com.onebill.training.assignments.day5;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		
		  Scanner input =new Scanner(System.in);
	      System.out.print("Enter the input number:");
	      int N =input.nextInt();
	      
	      int num,count=0;
	      int numberDigit[]=new int[3];
	      
	      while(N!=0) {               //Split the number and store into an integer arrays
	    	  num=N%10;
	    	  numberDigit[count]=num;
	    	  N=N/10;
	    	  count++;
	      }
	      
	      if(numberDigit[0]> numberDigit[1] && numberDigit[1]>numberDigit[2]) {
	    	  System.out.println("In Increasing Order");
	      }
	      
	      else if(numberDigit[0]<numberDigit[1] && numberDigit[1]<numberDigit[2]) {
	           System.out.println("In Decreasing Order");
	      }
	      
	      else {
	    	  System.out.println("Neither Increasing Nor Decreasing");
	      }
	      
	      input.close();
	}

}
