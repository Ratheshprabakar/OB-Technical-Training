public class ThrowDemo1 {

	public static void main(String[] args) {
	try {
		System.out.println("Before exception");
		throw new ArithmeticException();
	}catch (ArithmeticException e) {
   System.out.println("Arithmetic Exception");
	}
	System.out.println("Completed");
		
	}

}
