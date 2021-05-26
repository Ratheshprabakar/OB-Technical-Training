package com.onebill.training.day6;

public class StringsImmutableDemo {
	public static void concat1(String s1) {
		s1= s1+ "Sharma";
	}
	
	public static void  concat2(StringBuffer s2) {
		s2.append(" Sharma");
	}
	public static void  concat3(StringBuilder s3) {
		s3.append(" Virat");
	}

	public static void main(String[] args) {
		String s1 = "Rohit";
		StringBuffer s2 = new StringBuffer("Rohit");
		StringBuilder s3 = new StringBuilder("KoHli");
		
		//System.out.println(s1.equals(s2));
		concat3(s3);
		System.out.println(s3);
		

	}

}
