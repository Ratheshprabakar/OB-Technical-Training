
public class TryCatchDemo3 {

	public static void main(String[] args) {

		 int[] inputArray = new int[4];
		  try {
			  System.out.println("before");
			  inputArray[5]=10;
			  System.out.println("after");//won't execute
			  
		  }catch (ArrayIndexOutOfBoundsException e) {

	       System.err.println("Array out of Index Occurs");
	 
		  }

	}

}
