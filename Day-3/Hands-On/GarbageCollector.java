/*
 @Class Name : GarbageCollector
 @Description : Implemented Garbage Collector using System.gc() method
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector obj1 = new GarbageCollector();
		obj1=null;
		
		System.gc();

	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hello");
	}

}
