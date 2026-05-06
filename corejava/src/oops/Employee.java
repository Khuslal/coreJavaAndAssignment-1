package oops;

public class Employee {
	String name = "Sandip Sharma";
	int id = 56;
	int salary = 80_000;
	String position = "HR";
	
	void EmployeeDetails() {
		System.out.println("\nEmployee :");
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Position : "+position);
		System.out.println("Salary : "+salary);
	}
}
