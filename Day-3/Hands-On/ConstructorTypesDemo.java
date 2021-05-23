/*
 @Class Name : ConstructorDemo
 @Description : Implemented several types of constructors with an example : Student details
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */
class Student{
	String studentName;
	int studentId;
	public Student() {
		studentName="not known";
		studentId=0;
	}
	public Student(String studentName) {
		this();
		this.studentName="Rathesh";
	}
	public Student(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId +"]";
	}

	
}

public class ConstructorTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1= new Student("Rathesh", 12);
		System.out.println(student1.toString());
		
		Student student2= new Student("Rathesh");
		System.out.println(student2.toString());
		
		
	}

}
