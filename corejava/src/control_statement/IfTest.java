package control_statement;

public class IfTest {
	public static void main(String[] args) {
		int salary = 18_000;
		if (salary<50_000) {
			salary = salary+5000;
				
		}
		
		System.out.println("Total salary: "+salary);
	}
}
