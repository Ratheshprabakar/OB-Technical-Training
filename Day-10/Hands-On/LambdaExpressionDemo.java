/**
 * 
 */
package com.onebill.training.day10;

/**
 * @author Rathesh Prabakar
 *
 */
interface MyInterface2 {
	void show(int n);
}
public class LambdaExpressionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface2 ref1 = (int x) -> {System.out.print("The number is \t"+x);};
		ref1.show(20);
	}

}
