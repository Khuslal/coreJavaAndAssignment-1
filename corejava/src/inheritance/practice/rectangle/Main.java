package inheritance.practice.rectangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Rectangle rec = new Rectangle();
//		rec.userInput();
//		rec.printPerimeter();
//		rec.printArea();

		Rectangle rec1 = new Rectangle(3, 5);
		rec1.printPerimeter();
		rec1.printArea();
		System.out.println();

// passing 3 as argument for param s which assign to length and breadth of parent Rectangle
//		Square sq = new Square(3);
//		sq.printPerimeter();
//		sq.printArea();
		Scanner scn = new Scanner(System.in);
		Square square[] = new Square[10];
		int value = 0;
		for (int i = 0; i < square.length; i++) {
			System.out.println("Enter side for square: ");
			value = scn.nextInt();
			Square sq = new Square(value);
			square[i] = sq;
		}

		for (Square x : square) {
			x.printPerimeter();
			x.printArea();
		}

		scn.close();
	}
}
