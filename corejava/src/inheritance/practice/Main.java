package inheritance.practice;

public class Main {
	public static void main(String[] args) {
		/*
		 * Parent p = new Parent(); Child c = new Child(); p.printParent(); // calling
		 * parent method by parent class's object c.printChild(); // calling child
		 * method by child class's object c.printParent(); // calling parent method by
		 * child class's object
		 */
		Employee emp = new Employee("John Doe", 23, "9801020345", "Kathmandu", 150_000);
		Manager mgr = new Manager("Abrahab Bell", 29, "9801020745", "Canada", 225_000);
		
		System.out.println(emp);
		System.out.println(mgr);
	}
}
