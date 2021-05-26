class GenerateExceptions {
	public static void generateExceptions(int value) {
		int[] integerArray = new int[2];
		try {
			switch (value) {
			case 0:
				int answer = value / 0;
				System.out.println("The value is" + answer);
				break;
			case 1:
				integerArray[3] = 30;
				break;
			case 2:
				System.out.println("No exception occurs ");
				break;
			default:
				break;
			}
		} catch (ArithmeticException e) {
			System.out.println("Can't able divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound");
		} finally {
			System.out.println("100% executed");
		}
	}
}

public class FinallyDemo2 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			GenerateExceptions.generateExceptions(i);
		}
	}

}
