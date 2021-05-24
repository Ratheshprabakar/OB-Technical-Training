class OuterClass{
	class InnerClass{
		void show() {
			System.out.println("Inside class");
		}
	}
}

public class SimpleNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.InnerClass obj1 = new OuterClass().new InnerClass();
		obj1.show();

	}

}
