/*
 @Class Name : VariablesDemo
 @Description : Program to implement various types of variables (Local, Reference, Instance)
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

class Box{
	int length=10,breadth=20;
	public void area() {
		//return length*breadth;
		System.out.println(length);
	}
}

public class VariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box rectangleBox1=new Box();
		rectangleBox1.area();
	}
}


