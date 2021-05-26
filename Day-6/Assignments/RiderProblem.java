/**
 * 
 */
package com.onebill.training.day6.assignments;

import java.util.Scanner;

/**
 * @author rathesh
 *
 */
public class RiderProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int ridersCountWeekend=0;
		 int ridersCountWeekdays=0;
		 int totalKmsInWeekend=0;
		 int totalKmsInWeekdays=0;
		 
	     Scanner input =new Scanner(System.in);
	     
	     System.out.print("Number of riders:");
	     int N =input.nextInt();
	     
	     for(int i=0;i<N;i++) {
	    	 
	    	  System.out.println("Rider"+(i+1)+"\t");
	    	  System.out.println("Are you a rider (yes/no)");
	          String riderResponse =input.next();
	          
	          if(riderResponse.equalsIgnoreCase("yes")) {
	        	  
	    	      System.out.println("On which day did you drive ?:\n1.Weekend\n2.weekdays");
	    	      int driveDay =input.nextInt();
	    	      
	    	      switch(driveDay) {
	    	      
	    	      case 1:
	    	      {
	    	    	  System.out.println("How many kms did you drive on that day?");
	           	      int inputKms =input.nextInt();
	           	      totalKmsInWeekend+=inputKms;
	           	      ridersCountWeekend+=1;
	           	      break;
	    	      }
	    	      case 2:
	    	      {
	    	    	  System.out.println("How many kms did you drive on that day ?");
	               	  int inputKms =input.nextInt();
	               	  totalKmsInWeekdays+=inputKms;
	               	  ridersCountWeekdays+=1;
	    	      }
	    	 }
          }
	     }        
	     System.out.println("No of riders travelled on weekdays: "+ridersCountWeekdays);
	     System.out.println("No of riders travelled on weekends: "+ridersCountWeekend);
	     System.out.println("Total kms travelled by riders in weekdays: "+totalKmsInWeekdays);
	     System.out.println("Total kms travelled by riders in weekends: "+totalKmsInWeekend);
	 
   input.close();
	}
}
