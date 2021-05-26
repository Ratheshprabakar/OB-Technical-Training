package com.onebill.training.day6;

public class StringBufferDemo {

	public static void main(String[] args) {
		// Converting string to String Buffer
		String str = "OneBill";
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		//Converting string to string builder
		StringBuilder sb1 = new StringBuilder(str);
		sb1.append(" Software");
		System.out.println(sb1);
		
		// Converting String Buffer to string
		StringBuffer sb2 = new StringBuffer("Demo");
		String sb3 = sb2.toString();
		System.out.println(sb3);
		
		// Converting String Builder to string
		StringBuilder sb4 = new StringBuilder("Demo1");
		String sb5 = sb4.toString();
		System.out.println(sb5);
		
		

	}

}
