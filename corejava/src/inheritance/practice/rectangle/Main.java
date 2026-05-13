package inheritance.practice.rectangle;

public class Main {
	public static void main(String[] args) {
//		Rectangle rec = new Rectangle();
//		rec.userInput();
//		rec.printPerimeter();
//		rec.printArea();

		Rectangle rec1 = new Rectangle(4, 5);
		rec1.printPerimeter();
		rec1.printArea();

// passing 3 as argument for param s which assign to length and breadth of parent Rectangle
		Square sq = new Square(3);
		sq.printPerimeter();
		sq.printArea();

	}
}
