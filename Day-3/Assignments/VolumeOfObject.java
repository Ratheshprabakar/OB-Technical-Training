/*
 @Class Name : VolumeOfObjects
 @Description : Program to demonstrate the Constructor Overloading with an example of Volume of an objects with parameters 
 		width, height, depth
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

import java.util.Scanner;

class Object{
	int height,depth,width;
	public Object() {
		width=0;
		height = 0;
		depth=0;
	}
	public Object(int height) {
		this();
		this.height=height;
	}
	public Object(int height, int depth) {
		this();
		this.height = height;
		this.depth = depth;
	}
	public Object(int height, int depth,int width) {
		this.height = height;
		this.depth = depth;
		this.width=width;
	}
	public double volume() {
		return (width*height*depth);
	}
}


public class VolumeOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the Height, Depth and Width value");
		
		//Getting the height
		int height= input.nextInt();
		//depth
		int depth=input.nextInt();
		//width
		int width = input.nextInt();
		Object box1= new Object(); // No args
		Object box2=new Object(height); // With height
		Object box3= new Object(height, depth); // With height and depth
		Object box4 = new Object(height,depth,width);
		
		System.out.println(box1.volume());
		System.out.println(box2.volume());
		System.out.println(box3.volume());
		System.out.println(box4.volume());
		
		input.close();


	}

}
