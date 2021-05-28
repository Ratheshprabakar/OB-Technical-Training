/**
 * @Class : ThreadPoolDemo
 * @Description : Program to implement Thread Pool
 */
package com.onebill.training.day8.assignments;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPool implements Runnable {
	String threadName;
	public ThreadPool(String name) {
		this.threadName = name;
	}
	
	@Override
	public synchronized void run() {
     System.out.println(threadName + " Started");	
     try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
     System.out.println(threadName+" Ended");
	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorservice =Executors.newFixedThreadPool(3);
		ThreadPool threadPoolOne =new ThreadPool("Thread One");
		ThreadPool threadPoolTwo =new ThreadPool("Thread Two");
		ThreadPool threadPoolThree =new ThreadPool("Thread Three");
	   	 executorservice.execute(threadPoolOne);
	   	 executorservice.execute(threadPoolTwo);
	   	 executorservice.execute(threadPoolThree);
   	 
        executorservice.shutdown();
	}

}
