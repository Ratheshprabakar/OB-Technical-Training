/*
 @Class Name : DisplaySyntax
 @Description : DisplaySyntax class is created to print the syntax for all the program control statements including if, if-else,
		switch, for, while, do-while, break, continue, return
 
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

import java.util.Scanner;

public class DisplaySyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("1. Selection Statements\n2.Iteration Statements\n3. Jump Statements\nEnter Your choice\t");
		int choice = input.nextInt();
		int subChoice;
		switch(choice) {
		case 1:
		{
			System.out.println("1.If\n2.If-Else\n3.Switch");
			subChoice = input.nextInt();
			switch(subChoice)
			{
				case 1:
					System.out.println("if (condition) {\n" + 
							"  //  block of code to be executed if the condition is true\n" + 
							"} ");
					break;
				case 2:
					System.out.println("if (condition) {\n" + 
							"  //  block of code to be executed if the condition is true\n" + 
							"} else {\n" + 
							"  //  block of code to be executed if the condition is false\n" + 
							"}");
					break;
				case 3:
					System.out.println("switch(expression) {\n" + 
							"  case x:\n" + 
							"    // code block\n" + 
							"    break;\n" + 
							"  case y:\n" + 
							"    // code block\n" + 
							"    break;\n" + 
							"  default:\n" + 
							"    // code block\n" + 
							"} ");
					break;
				default:
					System.out.println("Invalid Choice");
			}
			break;
		}
		case 2:
		{
			System.out.println("1.for\n2.while\n3.Do While");
			subChoice = input.nextInt();
			switch(subChoice)
			{
				case 1:
					System.out.println("for (statement 1; statement 2; statement 3) {\n" + 
							"  // code block to be executed\n" + 
							"}");
					break;
				case 2:
					System.out.println("while (condition) {\n" + 
							"  // code block to be executed\n" + 
							"}");
					break;
				case 3:
					System.out.println("do {\n" + 
							"  // code block to be executed\n" + 
							"}\n" + 
							"while (condition);");
					break;
				default:
					System.out.println("Invalid Choice");
			}
			break;
		}
		case 3:
		{
			System.out.println("1.Break\n2.Continue\n3.Return");
			subChoice = input.nextInt();
			switch(subChoice)
			{
				case 1:
					System.out.println("break;");
					break;
				case 2:
					System.out.println("continue;");
					break;
				case 3:
					System.out.println("return Expression");
					break;
				default:
					System.out.println("Invalid Choice");
			}
			break;
		}
	}
	input.close();
}	

}

