/**
 * 
 */
package com.onebill.training.day8;

/**
 * @author Rathesh Prabakar
 *
 */
public class MainRunnableClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread1 obj1 = new RunnableThread1();
		RunnableThread2 obj2 = new RunnableThread2();
		
		Thread one = new Thread(obj1);
		one.start();
		
		Thread second = new Thread(obj2);
		second.start();

	}

}
