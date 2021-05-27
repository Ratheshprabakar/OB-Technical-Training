/**
 * 
 */
package com.onebill.training.day8;

/**
 * @author rathesh
 *
 */
class ChildThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Child Thread is executing "+i);
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ParentThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread childThread1 = new ChildThread();
		childThread1.run();
		
		Thread parentThread = new Thread(childThread1);
		parentThread.start();
		
	}

}
