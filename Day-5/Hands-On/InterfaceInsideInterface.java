interface InterfaceOuter{
	interface InterfaceInner{
		void showInsideInterface();
	}
	void showOutsideInterface();
}
class InterfaceInsideInterfaceDemo implements InterfaceOuter, InterfaceOuter.InterfaceInner {

	@Override
	public void showInsideInterface() {
			System.out.println("Calling the interface inside");		
	}

	@Override
	public void showOutsideInterface() {
		System.out.println("Calling the interface outer");		
		
	}
	
}

public class InterfaceInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceOuter.InterfaceInner obj1 = new InterfaceInsideInterfaceDemo();
		obj1.showInsideInterface();
		

	}

}
