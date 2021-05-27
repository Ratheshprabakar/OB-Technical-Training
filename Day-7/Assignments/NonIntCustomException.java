/**
 * @Class Name : NonIntCustomException
 * @Description : NonIntCustomException is implemented for the example of division of two numbers
 * @Version 1.0 26.05.2021
 * @author Rathesh Prabakar
 */

@SuppressWarnings("serial")
class NonIntResultException extends Exception{
	public NonIntResultException(String s) {
		super(s);
	}
}
public class NonIntCustomException {

	public static void main(String[] args) {
		
	int[] numeratorArray = {8,3,7,-32,98,102,321,598};
        int[] denominitorArray= {3,9,4,0,0};

        try {
        for(int i=0;i<numeratorArray.length;i++) {
        	try {
        		if(numeratorArray[i]<0 || denominitorArray[i]<0) 
        			throw new NonIntResultException("Array contains negative value");
        		else 
        		     System.out.println(numeratorArray[i]+"/"+denominitorArray[i]+" is "+numeratorArray[i]/denominitorArray[i]);
        		
        	 }catch(ArithmeticException e ) {
        		System.out.println("Cannot be divided by zero");
        	}catch(NonIntResultException e) {
        		System.out.println(e.getMessage());
        	}
        }
        	}catch(ArrayIndexOutOfBoundsException e) {
        		System.out.println("No denominator found to perform division");
            }
        	finally {
        		System.out.println("Successfully Completed");
        	}
	}

}
