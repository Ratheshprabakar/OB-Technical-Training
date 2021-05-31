/**
 * 
 */
package com.onebill.training.day10;

/**
 * @author Rathesh Prabakar
 *
 */
public class PClass extends CClass implements Interface1,Interface2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PClass obj = new PClass();
		obj.show();
		
	}
	public void show() {
		System.out.println("Show from PClass");
	}
	/*@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
	}*/

}
