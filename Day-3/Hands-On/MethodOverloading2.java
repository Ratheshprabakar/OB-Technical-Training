/*
 @Class Name : Method Overloading
 @Description : Method Overloading with same number of arguments
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */
class Overloading2{
	public void display(int n) {
		System.out.println(n);
	}
	public void display(char c) {
		System.out.println(c);
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading2 obj1=new Overloading2();
		obj1.display('c');
		obj1.display(1);

	}
}
