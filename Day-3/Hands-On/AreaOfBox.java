/*
 @Class Name : AreaofBox
 @Description : Understanding the several types of Constructors with an example of finding area of a box
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

import java.util.Scanner;

class RectangularBox{
	int length,breadth;
	public RectangularBox() {
		length = 0;
		breadth=0;
	}
	public RectangularBox(int length) {
		this();
		this.length=length;
	}
	public RectangularBox(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public int area() {
		return length*breadth;
	}
}

public class AreaOfBox {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the Length and Breadth details");
		
		//Getting the length
		int length= input.nextInt();
		//Breadth
		int breadth=input.nextInt();
		RectangularBox box1= new RectangularBox(); // No args
		RectangularBox box2=new RectangularBox(length); // With length
		RectangularBox box3= new RectangularBox(length, breadth); // With length and breadth
		
		System.out.println(box1.area());
		System.out.println(box2.area());
		System.out.println(box3.area());
		
		input.close();
	}

}
