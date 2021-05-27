/**
 * 
 */
package com.onebill.training.assignments.day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author rathesh
 *
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
