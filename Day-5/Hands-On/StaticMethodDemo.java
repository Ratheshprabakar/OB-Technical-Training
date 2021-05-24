class  EmployeeDetails1{
	int employeeId;
	String employeeName;
	static String companyName = "One Bill";
	public EmployeeDetails1(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	void display() {
		System.out.println(employeeId + " "+ employeeName+ " "+ companyName);
	}
	static void changecompanyName(String newCompanyName) {
		companyName= newCompanyName;
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails1.changecompanyName("Google");
		EmployeeDetails1 emp1 = new EmployeeDetails1(123, "Rathesh");
		EmployeeDetails1 emp2 = new EmployeeDetails1(124, "Rohan");

		emp1.display();
		emp2.display();

	}

}
