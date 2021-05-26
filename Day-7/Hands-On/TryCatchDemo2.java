class ExceptionTestDemo{
	static void generateException() {
		int [] inputArray = new int[3];
		System.out.println("before exception");
		
		inputArray[6]=10;
		System.out.println("this won't print");
	}
}
public class TryCatchDemo2 {

	public static void main(String[] args) {

		try {
			ExceptionTestDemo.generateException();
		}
		catch (Exception e) { 
System.out.println("Array out of index error");  
}
		System.out.println("End of program");
		System.out.println("Other business logic");
	}

}
