

public class FinallyDemo1 {

	public static void main(String[] args) {
	   try {
		   int result = 15/0;
		   System.out.println("The value is :"+ result);
	   }catch(Exception e){
		   System.out.println("Can't able to divide by zero");
	   }finally {
		   System.out.println("Executed");
	   }

	}

}
