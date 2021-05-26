package com.onebill.training.day6.assignments;

public class StringsImmutableDemo {
	
		public static void main(String[] args) {
		       String s1="Virat";
		       s1.concat("Kohli");
		       System.out.println(s1);   //output :Virat(Immutable) 
		       
		       s1 =s1.concat(" Kohli");    //explicit assignment    
		       System.out.println(s1);   // output :Virat Kohli
			}

}
