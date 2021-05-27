/**
 * 
 */
package com.onebill.training.day8;

/**
 * @author rathesh prabakar
 *
 */
public class RunnableThread2 implements Runnable {

	/**
	 * @param args
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<9;i++)
		{
			System.out.println(i);
		}
	}

}
