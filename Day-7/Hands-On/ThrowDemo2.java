public class ThrowDemo2 {
   static void validateAge(int age) {
	   if(age<18) {
		   throw new ArithmeticException("Not eligible to vote");
	   }else
	   {
		   System.out.println("Welcome you to cast your voting....");
	   }
   }
	public static void main(String[] args) {
		try {
			validateAge(16);
		}catch (ArithmeticException  e) {
       System.out.println("Not allowed to vote");
       System.out.println(e.getMessage());
		}
	System.out.println("Validation is completed, He is eligible to vote");
	}

}
