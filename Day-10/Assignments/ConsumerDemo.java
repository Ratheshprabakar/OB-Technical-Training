/**
 * 
 */
package com.onebill.training.day10.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Rathesh Prabakar
 *
 */
/*@FunctionalInterface         
Consumer Interface has only one method - accept();
accept() - accepts a single input argument 
*/

/*class ConsumerClass implements Consumer<Integer>{
                                              //implementing consumer interface in a class
	@Override
	public void accept(Integer t) {
    System.out.println(t);		
	}
}*/
public class ConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> inputList =Arrays.asList(10,20,30,40,50);
	    
	    /*Consumer<Integer> cons =new Consumer<Integer>() {   // Anonymous class
			@Override
			public void accept(Integer t) {
	            System.out.println(t);			
			}
		};*/
	    Consumer<Integer> cons = i -> System.out.println(i*5);  // Using Lambda Expressions
	    inputList.forEach(cons);

	}

}
