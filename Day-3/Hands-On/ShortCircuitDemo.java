/*
 @Class Name : ShortCircuitDemo
 @Description : Implementation of Short Circuit AND and OR
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

public class ShortCircuitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(false && true && true)
		{
			System.out.println("this is not printed");
		}
		else {
			System.out.println("This will be printed");
		}
		//Short Circuit OR
		if(true || false || false)
		{
			System.out.println("this will be printed");
		}
		else {
			System.out.println("This will not be printed");
		}

	}

}
