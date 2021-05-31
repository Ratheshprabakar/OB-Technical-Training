/**
 * 
 */
package com.onebill.training.day10;

/**
 * @author Rathesh Prabakar
 *
 */
interface MyInterface3 {
		void abstractMethodDemo(int x);
		
		default void normalMethod() {
			System.out.println("Hello from normalMethod()");
		}
		
		static void staticMethod() {
			System.out.println("Hello from Static Method()");
		}
}
public class DefaultAndStaticInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface3 ref = (int x)->{System.out.println("Hello from abstract method");};
		ref.abstractMethodDemo(10);
		ref.normalMethod();
		
		MyInterface3.staticMethod();
	}

}
