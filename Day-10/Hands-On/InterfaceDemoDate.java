/**
 * 
 */
package com.onebill.training.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Rathesh Prabakar
 *
 */
interface DateInterface {
	int process();
	
	static Date nowDate() {
		return new Date();
	}
	
	default String formatDate (Date date) {
		return date.toString();
	}
	default int calculate(int a, int b) {
		return a+b;
	}
}
public class InterfaceDemoDate {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DateInterface ref =()-> 100;
		System.out.println(ref.calculate(5, 2));
		System.out.println(ref.formatDate(new SimpleDateFormat("dd/MM/yyyy").parse("30/11/1999")));
		System.out.println(DateInterface.nowDate());

	}

}
