package com.onebill.training.assignments.day5;
abstract class Employee{
	abstract void display(String name);
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee() {
			void display(String name) {
				System.out.println(name);
			}
		}; 
		emp1.display("Rathesh");

	}

}
