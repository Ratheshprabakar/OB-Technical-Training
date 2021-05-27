/**
 * 
 */
package com.onebill.training.day8;

/**
 * @author Rathesh Prabakar
 *
 */
class Printer {
	void printDocuments(int noOfPages, String name)
	{
		for(int i=1;i<=noOfPages;i++)
		{
			System.out.println("Printing "+i+" page from "+ name);	
		}
	}
}
class RatheshThread extends Thread {
	Printer printRef;
	public RatheshThread(Printer p) {
		printRef = p;
		p.printDocuments(10, "Rathesh.pdf");
	}
	
}
class MohanThread extends Thread{
	Printer printRef;
	public MohanThread(Printer p) {
		printRef = p;
		p.printDocuments(7, "Mohan.pdf");
	}
}
public class SynchronizationInPrinterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		
		RatheshThread threadOne = new RatheshThread(printer);
		MohanThread threadTwo = new MohanThread(printer);
		
		threadOne.start();
		threadTwo.start();
		
	}

}
