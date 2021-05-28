/**
 * @Class : ThreadGroupDemo
 * @Description : Program to implement Thread Group 
 */
package com.onebill.training.day8.assignments;

/**
 * @author Rathesh Prabakar
 * @version 1.0 27.05.2021
 */

public class ThreadGroupDemo implements Runnable{

	/**
	 * @param args
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		 ThreadGroupDemo tg = new ThreadGroupDemo();  
         ThreadGroup threadGroup1 = new ThreadGroup("Parent Thread Group");  
           
         Thread threadOne = new Thread(threadGroup1, tg,"X Thread");  
         threadOne.start(); 
         
         Thread threadTwo = new Thread(threadGroup1, tg,"Y Thread");  
         threadTwo.start();  
         
         System.out.println("Thread Group Name: "+threadGroup1.getName());  
	}

}
