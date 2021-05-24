class Interface{
	interface Demo{
		void show();
	}
}

public class InterfaceInsideClass implements Interface.Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface.Demo obj1 = new InterfaceInsideClass();
		obj1.show();;

	}

	@Override
	public void show() {
		System.out.println("Demo for the interface inside a class");
	}

}
