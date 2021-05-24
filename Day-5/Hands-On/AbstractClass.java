
abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");		
	}
	
}
class Triangle extends Shape{

	void draw() {
		System.out.println("Drawing Triangle");		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1= new Rectangle();
		s1.draw();
		
		Shape s2 = new Triangle();
		s2.draw();
		
		

	}

}
