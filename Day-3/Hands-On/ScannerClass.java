/*
 @Class Name : ScannerClass
 @Description : Understanding the Scanner with an example : Employee Details
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the Employee details");
		
		//Getting the name
		String employeeName= input.nextLine();
		//Gender
		char employeeGender=input.next().charAt(0);
		//Age
		int employeeAge=input.nextInt();
		//Mobile number
		long employeeMobileNumber=input.nextLong();
		//Salary
		double employeeSalary=input.nextDouble();
		
		System.out.println("The employee details are \n");
		System.out.println("Name: "+employeeName);
		System.out.println("Gender: "+employeeGender);
		System.out.println("Age: "+employeeAge);
		System.out.println("Mobile Number: "+employeeMobileNumber);
		System.out.println("Salary: "+employeeSalary);
		
		input.close();
	}

}
