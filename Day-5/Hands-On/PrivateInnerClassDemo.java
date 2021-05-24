class OuterClassDemo {
	private class InnerClassDemo{
		void print() {
			System.out.println("Inside inner class");
		}
		
	}
	void display() {
		OuterClassDemo.InnerClassDemo obj1 = new OuterClassDemo().new InnerClassDemo();
		obj1.print();
	}
}

public class PrivateInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
