
public class TryCatchDemo5 {

	public static void main(String[] args) {
		int numerator[] = { 8, 4, 16, 20, 32, 124, 80, 66, 12 };
		int denominator[] = { 4, 0, 2, 0, 8 };
		try {

		for (int i = 0; i < numerator.length; i++) {
			try {
				System.out.println(numerator[i] + " / " + denominator[i] + " = " + numerator[i] / denominator[i]);
			} 
			catch (ArithmeticException e) {

				System.out.println("Can't divide a Numerator with zero");
			}
		}
	    }
			catch (Exception e) {
				System.out.println("General Exception....");
				System.out.println("Code terminated..");
			}
		

	}

}
