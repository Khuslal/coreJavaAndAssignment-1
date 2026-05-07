package employee;

public class Employee {
	int salary;
	int hour;
	public int getInfo() {
		return hour;
	}
	
	
	public void AddSal(int salary) {
		this.salary = salary;
		if(salary < 500) {
			salary +=10;	
			System.out.println("Salary after adding $10 : "+salary);
		}else {
			System.out.println("Salary without adding $10 : "+salary);
		}
	}
	
	public void AddWork(int hour) {
		this.hour = hour;
		if(hour > 6) {
			salary += 5;
			System.out.println("Salary after adding $5 : "+salary+" for "+hour+" hrs of working.");
		}else {
			System.out.println("Salary without adding $5 : "+salary);
		}
	}
	
}
