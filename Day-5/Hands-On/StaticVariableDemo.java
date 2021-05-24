class  EmployeeDetails{
	int employeeId;
	String employeeName;
	static String companyName = "One Bill";
	public EmployeeDetails(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	void display() {
		System.out.println(employeeId + " "+ employeeName+ " "+ companyName);
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp1 = new EmployeeDetails(123, "Rathesh");
		EmployeeDetails emp2 = new EmployeeDetails(124, "Rohan");

		emp1.display();
		emp2.display();

	}

}
