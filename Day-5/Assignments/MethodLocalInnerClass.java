package com.onebill.training.assignments.day5;
class OuterClass{
	void display(String name) {
		class InnerClass{
			public void print() {
				System.out.println("Hi I am "+name+", Message from Method local Inner class");
		}
	}
		InnerClass innerObject = new InnerClass();
		innerObject.print();
	}
}

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerObject = new OuterClass();
		outerObject.display("Rathesh");

	}

}
