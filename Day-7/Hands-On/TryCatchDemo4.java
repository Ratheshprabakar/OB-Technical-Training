public class TryCatchDemo4 {

	public static void main(String[] args) {
		int numerator[] = { 3, 4, 16, 20, 32, 90, 80, 66, 12 };
		int denominator[] = { 4, 0, 2, 0, 8 };
		for (int i = 0; i < numerator.length; i++) {
			try {
				System.out.println(numerator[i] + " / " + denominator[i] + " = " + numerator[i] / denominator[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bound");
			} catch (ArithmeticException e) {

				System.out.println("Can't divide a numerator with zero");
			} catch (Exception e) {
				System.out.println("General Exception");
			}
		}

	}

}
