/**
 * @Class Name : RethrowDemo
 * @Description : Rethrow is demonstrated using a guessing game
 */
package com.onebill.training.assignments.day7;
/**
 * 
 * @Version 1.0 26.05.2021
 * @author Rathesh Prabakar
 */
import java.util.Scanner;

@SuppressWarnings("serial")
class WrongGuessException extends Exception{           
	public WrongGuessException(String s) {
		super(s);
	}
}
class Rethrow{
	
	int correctAnswer = 9;
	public void answerCheck(int inputNumber) throws WrongGuessException {
		try {
		     if(inputNumber==correctAnswer) 
			       System.out.println("Congratulations, You guessed correctly!");
		     else 
			       throw new WrongGuessException("OOPS, Your guess is wrong");
		}catch(WrongGuessException e) {
			System.out.println("Rethrowing..");          
			throw e;                                      
		}
	}
}
public class RethrowDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
	     Rethrow rethrowObj =new Rethrow();
	     System.out.print("Enter a number (within 1-9):");
	     int inputNumber =input.nextInt();
	     
	     try {
	         rethrowObj.answerCheck(inputNumber);
	     }catch(Exception e) {
	    	 System.out.println(e.getMessage());
	       }
	     input.close();
	}

}
