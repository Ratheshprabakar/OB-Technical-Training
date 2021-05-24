class Triangle {
	double width;
	double height;
	void print() {
		System.out.println("Width of the triangle"+width+"\nHeight of the triangle "+height);
	}
}
class StyleClass extends Triangle{
	double areaOfTriangle() {
		return width* height;
	}
}
public class SingleInteritance {

	public static void main(String[] args) {
		StyleClass t1 = new StyleClass();
		t1.height=7.0;
		t1.width=3.8;
		
		t1.print();
		t1.areaOfTriangle();
	}

}
