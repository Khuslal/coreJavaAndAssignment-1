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
			System.out.println(salary);
		}else {
			System.out.println(salary);
		}
	}
	
	public void AddWork(int hour) {
		this.hour = hour;
		if(hour > 6) {
			salary += 5;
			System.out.println(salary);
		}else {
			System.out.println(salary);
		}
	}
	
}
