/**
 * 
 */
package com.onebill.training.day10;

/**
 * @author Rathesh Prabakar
 *
 */
interface MyInterface {
	void show();
}
public class LambdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface  ref = () -> {System.out.println("Inside show method");};
		
		ref.show();
	}

}
