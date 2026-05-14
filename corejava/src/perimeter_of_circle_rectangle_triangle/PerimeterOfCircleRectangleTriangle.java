package perimeter_of_circle_rectangle_triangle;

import java.util.Scanner;

public class PerimeterOfCircleRectangleTriangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Choose 'C': circle, 'R' : rectangle and 'T' : triangle");
		String choice = scn.next();
		if (choice.equalsIgnoreCase("C")) {
			// Perimeter of Circle
			System.out.print("Choose 'r' for radius or 'd' for diameter : ");
			String choose = scn.next();

			float pi = 3.14159f;
			if (choose.equalsIgnoreCase("C")) {
				System.out.print("Enter Radius: ");
				double radius = scn.nextDouble();
				;
				double circle = 2 * pi * radius;
				System.out.println("The perimeter of circle for radius: " + radius + " = " + circle);

			} else if (choose.equalsIgnoreCase("D")) {
				System.out.print("Enter Diameter: ");
				double diameter = scn.nextDouble();
				double circle = pi * diameter;
				System.out.println("The perimeter of circle for diameter: " + diameter + " = " + circle);

			} else {
				System.out.println("Enter the correct command");
			}
		} else if (choice.equalsIgnoreCase("R")) {
			// Perimeter of Rectangle

			System.out.print("\nEnter length of rectangle: ");
			double length = scn.nextDouble();
			System.out.print("Enter width of rectangle: ");
			double width = scn.nextDouble();
			double rectangle = 2 * (length + width);
			System.out.println(
					"The perimeter of rectangle for length: " + length + " and width: " + width + " = " + rectangle);

		} else if (choice.equalsIgnoreCase("T")) {
			// Perimeter of Triangle

			System.out.println("Enter the value for side a ");
			double a = scn.nextDouble();
			System.out.println("Enter the value for side b ");
			double b = scn.nextDouble();
			System.out.println("Enter the value for side c ");
			double c = scn.nextDouble();

			double triangle = a + b + c;
			System.out.println(
					"The perimeter of triangle for side a : " + a + " b : " + b + " and c: " + c + " = " + triangle);
		} else {
			System.out.println("Invalid Command ");
		}
		scn.close();

	}
}
