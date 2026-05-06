package employee;

class EmployeeInfo{
	
	String name;
	int yoj; // year of joining
	int salary;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// method
	
}
public class InformationOfEmployee {
	
	public static void main(String[] args) {
		EmployeeInfo em = new EmployeeInfo();
		em.name = "Robert";
		em.yoj = 1994;
		em.address = "Pokhara";
		em.address = "64C- WallsStreat";
		em.setName("Robert");
		System.out.println(em.getName());
	}
}
