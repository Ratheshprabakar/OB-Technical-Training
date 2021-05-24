package com.onebill.training.interfaces;

interface MyInterface{
	void myMethod1();
}

public class InterfaceDemo implements MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface interfaceObject = new InterfaceDemo();
		interfaceObject.myMethod1();

	}
	@Override
	public void myMethod1() {
		System.out.println("This is Method 1");
	}

}
