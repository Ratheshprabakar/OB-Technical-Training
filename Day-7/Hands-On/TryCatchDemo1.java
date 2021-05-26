public class TryCatchDemo1 {

	public static void main(String[] args) {
	  int[] inputArray = new int[4];
	  try {
		  System.out.println("Before modification");
		  inputArray[6]=20;
		  System.out.println("After modification");//won't execute
		  
	  }catch (Exception e) {
      
	 System.out.println("Array out of index error");
     //  e.printStackTrace();
       
	  }

	}

}
