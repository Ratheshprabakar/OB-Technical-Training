/**
 * @Class : ThreadSuspendResumeStop
 * @Description : Program to implement Thread functions including suspend(), resume(), stop() 
 */
package com.onebill.training.day8.assignments;

/**
 * @author Rathesh Prabakar
 * @version 1.0 27.05.2021
 */
class ThreadOne extends Thread{
	public void run()
	{
	for (int i = 1; i < 100; i++) {
		System.out.println("Thread is "+i);
	}
	}
}
public class ThreadSuspendResumeStop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadOne threadOne = new ThreadOne();
		
		Thread.sleep(500);
		threadOne.start();  
		
		
		Thread.sleep(400);         //stop thread 
		threadOne.stop();
		
		
		Thread.sleep(5);
		threadOne.suspend();        //suspend thread 
		
		
		Thread.sleep(5000);
		threadOne.resume();      //resume thread

	}

}
