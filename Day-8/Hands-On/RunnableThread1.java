/**
 * 
 */
package com.onebill.training.day8;

/**
 * @author rathesh prabakar
 *
 */
public class RunnableThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			try {
				System.out.println(i);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	

}
