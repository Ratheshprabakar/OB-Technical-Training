/**
 * @Class Name : TryWithResources
   @Description : Demonstrated Try with Resources with opening and printing a file
 */
package com.onebill.training.assignments.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Rathesh Prabakar 
 * @Version 1.0 26.05.2021
 */
public class TryWithResources {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fileLine;
		   
	    try(BufferedReader input = new BufferedReader(new FileReader("/home/rathesh/Desktop/file.txt"))) {
	      while ((fileLine = input.readLine()) != null) {
	           System.out.println(fileLine);
	      }
	     } catch (IOException e) {
	           System.out.println("IOException: " + e.getMessage());
	     } finally {
	    	   System.out.println();
	           System.out.println("Completed");
	      }
	}

}
