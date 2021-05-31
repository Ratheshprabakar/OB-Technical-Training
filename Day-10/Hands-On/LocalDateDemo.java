/**
 * 
 */
package com.onebill.training.day10;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * @author Rathesh Prabakar
 *
 */
public class LocalDateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate someDate = LocalDate.of(2020, Month.NOVEMBER, 30);
		System.out.println(someDate);
		
		LocalDate fromZone = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(fromZone);
		
		LocalDate dateFromEpoch = LocalDate.ofEpochDay(365);
		System.out.println(dateFromEpoch);

	}

}
