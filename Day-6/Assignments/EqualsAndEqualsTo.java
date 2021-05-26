/**
 * 
 */
package com.onebill.training.day6.assignments;

/**
 * @author rathesh
 *
 */
public class EqualsAndEqualsTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1= "Rathesh";
		String s2="Rathesh";
		
		if(s1.equals(s2))
			System.out.println("S1 and S2 are equal by equals() method");
		if(s1==s2)
			System.out.println("S1 and S2 are equal by equals to operator");

	}

}
