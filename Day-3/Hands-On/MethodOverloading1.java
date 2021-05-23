/*
 @Class Name : MethodOverloading1
 @Description : Method Overloading with change in order of parameters
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */
class Overloading1{
	public void display(int n, char c) {
		System.out.println(n);
	}
	public void display(char c, int n) {
		System.out.println(c);
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading1 obj1=new Overloading1();
		obj1.display(5, 'c');
		obj1.display('x', 1);

	}

}
