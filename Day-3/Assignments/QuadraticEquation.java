/*
 @Class Name : QuardraticEquation
 @Description : Using static import to find the roots of a quadratic equation
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */
import static java.lang.Math.*;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c\n");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant=((pow(b, 2))-(4*a*c));
		double squareRoot = sqrt(discriminant);
		double firstRoot=0,secondRoot=0;
		if(discriminant>0)
		{
			firstRoot = (-b + squareRoot)/(2*a);
			secondRoot = (- b - squareRoot)/(2*a);
		}
		else if(discriminant==0) {
			firstRoot = (-b + squareRoot)/(2*a);
			secondRoot=firstRoot;
		}
		System.out.println("The Roots are\t"+firstRoot+" "+secondRoot);
		
		input.close();
	}

}
