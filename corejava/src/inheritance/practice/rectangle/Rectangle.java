package inheritance.practice.rectangle;

//import java.util.Scanner;

public class Rectangle {

	int length;
	int breadth;

	/*
	 * Scanner scn = new Scanner(System.in);
	 * 
	 * Constructor created for user input
	 * 
	 * public Rectangle() {
	 * 
	 * }
	 * 
	 * public void userInput() { System.out.println("Enter length : "); length =
	 * scn.nextInt(); System.out.println("Enter breadth : "); breadth =
	 * scn.nextInt(); }
	 */

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void printPerimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter : " + perimeter);
	}

	public void printArea() {
		int area = length * breadth;
		System.out.println("Area :" + area);
	}
}
