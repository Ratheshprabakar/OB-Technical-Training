/**
 * 
 */
package com.onebill.training.day10;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * @author Rathesh Prabakar
 *
 */
public class LocalTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalTime time =LocalTime.now();
	     System.out.println("Current Local Time:"+time);
	     
	     LocalTime specificTime = LocalTime.of(12, 25, 55, 30);
	     System.out.println("Specifc Time:"+specificTime);
	     
	     LocalTime zoneBasedTime =LocalTime.now(ZoneId.of("Europe/Paris"));
	     System.out.println("Current Time in Paris :"+zoneBasedTime);
	     
	     LocalTime timebasedonSeconds = LocalTime.ofSecondOfDay(10000);
	     System.out.println("Time in Seconds:"+timebasedonSeconds);

	}

}
