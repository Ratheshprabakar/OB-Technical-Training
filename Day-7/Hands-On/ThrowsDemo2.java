

import java.util.Scanner;

class GenerateTest {
	void generateException(int number1, int number2) throws ArithmeticException {
		System.out.println("Division of " + number1 + "and " + number2 + " is " + number1 / number2);
	}
}

public class ThrowsDemo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number1, number2;
		System.out.println("Enter number1");

		number1 = input.nextInt();
		System.out.println("Enter number2");

		number2 = input.nextInt();

		GenerateTest obj1 = new GenerateTest();
		try {
			obj1.generateException(number1, number2);
		} catch (Exception e) {
			System.out.println("Division not possible");
		}
		input.close();
	}

}
