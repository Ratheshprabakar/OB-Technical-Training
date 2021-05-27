/**
 * @Class Name : ValidateStudentRegistration
 * @Description : ValidateStudentRegistration is to validate the student details while during registration. If the age is greater than 12 and 
		  weight is greater than 35 means, student is eligible and their details are successfully stored.
 * @Version 1.0 26.05.2021
 * @author Rathesh Prabakar
 */
import java.util.Scanner;

@SuppressWarnings("serial")
class NotEligibleException extends Exception{
	public NotEligibleException(String s) {
		super(s);
	}
}
public class ValidateStudentRegistration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
	 Scanner input =new Scanner(System.in);
   	 
	 System.out.print("Enter your Name:");
   	 String studentName =input.next();
   	 
   	 System.out.print("Enter your Email-id:");
   	 String studentEmail =input.next();
   	 
   	 System.out.print("Enter your Mobile Number:");
   	 long studentMobileNumber =input.nextLong();
   	 
   	 System.out.print("Enter your Age:");
   	 int studentAge =input.nextInt();
   	 
   	 System.out.print("Enter your weight:");
   	 int studentWeight =input.nextInt();
   	 
   	 try {
   	 if(studentAge <12 || studentWeight<35) {
   		 throw new NotEligibleException("Sorry, You are not eligible for registration !");            //exception
   	 }
   	 else {
   		 System.out.println("Registered Successfully! Thank you\n");
   		 System.out.println("Your details:");
   		 System.out.println("Name:"+studentName+"\n"+"Email-Id:"+studentEmail+"\nMobile Number: "+studentMobileNumber+"\nAge: "+studentAge+"\nWeight: "+studentWeight);
   	 }
   	 }catch(Exception e) {
   		 System.out.println(e.getMessage());   
   	 }
   	 
   	 input.close();
	}

}
