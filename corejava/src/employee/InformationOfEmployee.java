package employee;


class EmployeeInfo{
	
	String name;
	int yoj; // year of joining
	String address;
	// methods
	public void printDetails() {
		System.out.println(name+"	 "+yoj+" 		 "+address);
	}
	
}
// Main Class
public class InformationOfEmployee {
	
	public static void main(String[] args) {
		EmployeeInfo em1 = new EmployeeInfo();
		em1.name = "Robert";
		em1.yoj = 1994;
		em1.address = "64C- WallsStreat";
		
		EmployeeInfo em2 = new EmployeeInfo();
		em2.name = "Sam";
		em2.yoj = 2000;
		em2.address = "68D- WallsStreat";
		
		EmployeeInfo em3 = new EmployeeInfo();
		em3.name = "John";
		em3.yoj = 1999;
		em3.address = "26B- WallsStreat";
		
		System.out.println("Name 	 "+"Year of joining "+"Address");
		em1.printDetails();
		em2.printDetails();
		em3.printDetails();
	}
}
