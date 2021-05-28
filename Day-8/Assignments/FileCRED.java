/**
 * @class : FileCRED
 * @Description : Program to implement CRED operations in File using Thread Synchronization concept
 */
package com.onebill.training.day8.assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Rathesh Prabakar
 * @version 1.0 27.05.2021
 *
 */
class Operator extends Thread{
	FileOperations customerRef;
	public Operator(FileOperations p, String fileName,int mode) {
		customerRef = p;
		switch(mode) {
			case 1:
				synchronized (p) {
					p.write(fileName);
				}
				break;
			case 2:
					p.read(fileName);
					break;
			case 3:
				synchronized (p) {
					p.createFile(fileName);
				}
					break;
			
		}				
		}		
}
class FileOperations {
	
	Scanner input = new Scanner(System.in);
	void createFile(String fileName) {
		
		File file = new File(fileName); //initialize File object and passing path as argument  
    	try   
    	{  
    		file.createNewFile();  //creates a new file 
    		for(int i=0;i<5;i++) {
    			System.out.println("File Successfully created "+fileName);	
    		}
    		
    	}   
    	catch (IOException e)   
    	{  
    		e.printStackTrace();    //prints exception if any  
    	}
    
	}
	void read(String fileName)
	{
		String fileLine;
		try(BufferedReader input = new BufferedReader(new FileReader(fileName))) {
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
	
	void write(String fileName) {
		
		try {
    		FileWriter fw = new FileWriter(fileName, true);
    		BufferedWriter bw = new BufferedWriter(fw);
    		PrintWriter pw = new PrintWriter(bw);
    		System.out.println("Enter the string");
    		String writeString = input.nextLine(); 
        	pw.println(writeString);
    		pw.flush();
    		pw.close();
    	}
    	catch(Exception e){
    	}
		input.close();
	}

}
public class FileCRED {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperations obj = new FileOperations();
		
		Operator obj0 = new Operator(obj, "/home/rathesh/Desktop/file.txt", 3); //3 - create  
		Operator obj1 = new Operator(obj, "/home/rathesh/Desktop/file.txt", 1); //1 - write
		Operator obj2 = new Operator(obj, "/home/rathesh/Desktop/file.txt", 2); //2 - read
		
		obj1.start();
		obj2.start();
		obj0.start();
	}

}
