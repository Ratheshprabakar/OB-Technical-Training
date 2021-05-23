/*
 @Class Name : WrapperClass
 @Description : WrapperClass is created to implement Autoboxing and Unboxing concepts 
 
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

public class WrapperClass {

	public static void main(String[] args) {
		String integerString="4";
		Integer integerNumber = new Integer(integerString); // Boxing a string into integer
		System.out.println(integerNumber+2);
		
		String doubleString = "4.17";
		Double doubleNumber = new Double(doubleString); // Boxing a string into double
		System.out.println(doubleNumber*4.0);
		
		Integer wrapperClassIntegerVariable = 5;
		int unboxingInteger = wrapperClassIntegerVariable; // Unboxing an integer from wrapper class to integer variable
		System.out.println(unboxingInteger);
		
		Double wrapperClassDoubleVariable = 5.142;
		double unboxingDouble = wrapperClassDoubleVariable; // Unboxing an integer from wrapper class to double variable
		System.out.println(unboxingDouble);
		
		System.out.println(Integer.parseInt(integerString)*90); // Boxing a string into integer using parseInt method
		

	}

}
