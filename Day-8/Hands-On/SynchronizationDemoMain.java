/**
 * 
 */
package com.onebill.training.day8;

/**
 * @author Rathesh Prabakar
 *
 */
public class SynchronizationDemoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizationDemoTable table1 = new SynchronizationDemoTable();
		
		Runnable ref1 = ()-> {
			synchronized (table1) {
				table1.printTable(2);	
			}
			
	};
		Runnable ref2 = () -> {
			synchronized (table1) {
				table1.printTable(5);	
			}
		};
		
		Thread threadOne = new Thread(ref1);
		Thread threadTwo = new Thread(ref2);
		
		threadOne.start();
		threadTwo.start();
}
}
