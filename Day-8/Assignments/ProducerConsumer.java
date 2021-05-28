/**
 * @Class : ProducerConsumer
 * @Description : Program to solve producer consumer problem using Thread Synchronization.
 */
package com.onebill.training.day8.assignments;

/**
 * @author Rathesh Prabakar
 * @Version 1.0 27.05.2021
 */
class Tunnel {
	
	  private int contents;
	   private boolean available = false;
	   
	   public synchronized int get() {
	      while (available == false) {
	         try {
	            wait();
	         } catch (InterruptedException e) {}
	      }
	      available = false;
	      notifyAll();
	      return contents;
	   }
	   public synchronized void put(int value) {
	      while (available == true) {
	         try {
	            wait();
	         } catch (InterruptedException e) { } 
	      }
	      contents = value;
	      available = true;
	      notifyAll();
	   }	
}
class Consumer extends Thread {
	   private Tunnel tunnelHole;
	   private int number;
	   
	   public Consumer(Tunnel t, int number) {
	      tunnelHole = t;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	      for (int i = 0; i < 10; i++) {
	         value = tunnelHole.get();
	         System.out.println("Consumer " + this.number + " got: " + value);
	      }
	   }
	}
class Producer extends Thread {
	   private Tunnel tunnelHole;
	   private int number;
	   public Producer(Tunnel t, int number) {
	      tunnelHole = t;
	      this.number = number;
	   } 
	   public void run() {
	      for (int i = 0; i < 5; i++) {
	    	  tunnelHole.put(i);
	         System.out.println("Producer " + this.number + " put: " + i);
	         try {
	            sleep((int)(Math.random() * 50));
	         } catch (InterruptedException e) { }
	      } 
	   }
	} 
public class ProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Tunnel t = new Tunnel();
	      Producer p1 = new Producer(t, 1);
	      Consumer c1 = new Consumer(t, 1);
	      p1.start(); 
	      c1.start();

	}

}
