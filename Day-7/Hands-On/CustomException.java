

@SuppressWarnings("serial")
class CustomException1 extends Exception {

	public CustomExp(String s) {
		// Call constructor of parent Exception
		super(s);
	}

}

public class CustomException {

	public static void main(String[] args) {
	
		try {
			// Throw an object of user defined exception
			throw new CustomException1("Exception of array");
		} catch (CustomException1 e) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(e.getMessage());
		}
	}

}
