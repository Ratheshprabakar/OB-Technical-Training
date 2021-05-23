/*
 @Class Name : ThisDemo
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */
class Employee{
	String employeeName;
	int employeeId;
	int employeeAge;
	float employeeSalary;
	public Employee(String employeeName, int employeeId, int employeeage, float employeeSalary) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeage;
		this.employeeSalary = employeeSalary;
	}
	void display() {
		System.out.println(employeeName +" "+ employeeId + " "+ employeeAge +" "+ employeeSalary);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1= new Employee("Rathesh", 12,21,10000f);
		employee1.display();
		
	}

}
