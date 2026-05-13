package inheritance.practice;

public class Main {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		p.printParent(); // calling parent method by parent class's object
		c.printChild(); // calling child method by child class's object
		c.printParent(); // calling parent method by child class's object
		
	}
}
