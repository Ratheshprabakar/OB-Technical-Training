/**
 * @classname : RiderProblem
 * @Description : Program to implement Riders problem to calculate no of riders in weekend and week days,
 * 				  Kms they traveled using Jagged Array
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh prabakar
 * @version 1.0 26.05.2021
 *
 */
public class RiderProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int[][] ridersArray = new int[2][];
		 int weekendRidersCount=0;
		 int weekdaysRidersCount=0;
		 
	     Scanner input =new Scanner(System.in);
	     
	     System.out.print("Total number of people");
	     int N =input.nextInt();
	     
	     int weekEndCount=0,weekDaysCount=0,totalWeekEndKms=0,totalWeekDayKms=0;
	     
	     ridersArray[0] =new int[N];
		 ridersArray[1] =new int[N];
	     for(int i=0;i<N;i++) {
	    	 
	    	  System.out.println("Person-"+(i+1)+"\t");
	    	 
	    	  System.out.println("Are you a rider (Yes/No)");
	          String riderConfirmation =input.next();
	          if(riderConfirmation.equalsIgnoreCase("yes")) {
	    	      System.out.println("On which day did you drive ?:\n1.Weekend\n2.weekdays");
	    	      int rideDay =input.nextInt();
	    	      
	    	      switch(rideDay){
	    	    	  case 1:
	    	    	  {
	           	            System.out.println("How many kms did you drive on Weekend");
	           	            int rideKms =input.nextInt();
	           	            ridersArray[0][weekEndCount]=rideKms;
	           	            weekendRidersCount+=1;
	           	            weekEndCount++;
	           	            break;
	    	    	  }
	    	    	  case 2: 
	    	    	  {
	           	           System.out.println("How many Km did you drive on weekdays");
	           	           int rideKms =input.nextInt();
	           	           ridersArray[1][weekDaysCount]=rideKms;
	           	           weekdaysRidersCount+=1;
	           	           weekDaysCount++;
	           	           break;
	    	    	  }
           	       default:
           	    	   System.out.println("Invalid choice!, Please enter the valid one");
                   }
	          }
	          else {
	        	  System.out.println("Only Riders are allowed to enter");
	          }
	      }
	     //Week end kms
	     for(int i:ridersArray[0]) {
	    	 if(i==0) 
	    		 continue;                       
	        else
	        	totalWeekEndKms+=i;
	      }
	     
	     //Week days kms
	     System.out.println();
	     
	     for(int i:ridersArray[1]) {
	    	 if(i==0) 
	    		 continue;                                
	        else
	        	totalWeekDayKms+=i;
	      }
	     
	     System.out.println();
	     System.out.println("Total Number of Weekend riders:"+weekendRidersCount);
	     System.out.println("Total Number of Weekdays riders:"+weekdaysRidersCount);
	     System.out.println("Total Kms travelled in Weekends: "+totalWeekEndKms);
	     System.out.println("Total kms travelled in Weekdays: "+totalWeekDayKms);
	     
	     input.close();
	}
}
