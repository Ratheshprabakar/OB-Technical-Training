/**
 * @Description : Difference between start() and run() in thread
 */
package com.onebill.training.day8;

/**
 * @author rathesh
 *
 */

public class MTDemo2 extends Thread {

	/**
	 * @param args
	 */
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MTDemo2 obj1 = new MTDemo2();
		obj1.start();

		MTDemo2 obj2 = new MTDemo2();
		obj2.run();
	}

}
