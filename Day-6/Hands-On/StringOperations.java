package com.onebill.training.day6;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "rathesh is";
		System.out.println(s1.length());
		
		String s2 = "good boy";
		System.out.println(s1.concat(s2));
		
		System.out.println(s2.indexOf('b'));
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s2.substring(5));
		
		String s3 = "      happy";
		System.out.println(s3.trim());
		
		String s4 = "Java";
		String s5 = "Java";
		
		System.out.println(s4.compareTo(s5));

	} 

}
