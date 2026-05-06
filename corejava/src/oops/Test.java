package oops;

public class Test {
	public static void main(String[] args) {
		Book b = new Book();
		
		b.id = 3432;
		b.name = "Math";
		b.author = "C.M Joshi";
		b.price = 4000;
		
//		b.printBook();
		
		/*
		 * Q. Create class of : 
		 * 	-Car
		 * 	-Employee
		 * 	-Pen
		 * 	-Rectangle
		 */
		Car car = new Car();
		car.printCar();
		Employee em = new Employee();
		em.EmployeeDetails();
		Pen pen = new Pen();
		pen.PenDetails();
		Rectangle rect = new Rectangle();
		rect.printRectangle();
	}
}
