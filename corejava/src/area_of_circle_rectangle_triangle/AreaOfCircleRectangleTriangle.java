package area_of_circle_rectangle_triangle;

import java.util.Scanner;

public class AreaOfCircleRectangleTriangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Choose 'C':circle 'R':rectangle, and 'T':triangle");
		String choice = scn.next();
		if(choice.equalsIgnoreCase("c")) {
			// 1. Area of Circle
			double pi = 3.14159f;
			
			System.out.print("Enter the value of radius: ");
			double radius = scn.nextFloat();
			double circle= pi*Math.pow(radius, 2);
			
			System.out.println("The area of circle with radius "+radius+" : "+ circle+"\n");
			
		}else if(choice.equalsIgnoreCase("R")) {
			// 2. Area of Rectangle
			System.out.print("Enter the value of length: ");
			 double length = scn.nextFloat();
			
			System.out.print("Enter the value of width: ");
			double width = scn.nextFloat();
			
			double rectangle= length*width;
			
			System.out.println("The area of rectangle with length "+length+" and "+width+" : "+ rectangle+"\n");
			
		}else if(choice.equalsIgnoreCase("T")){
			// 3. Area of Triangle
			System.out.print("Enter the value of base: ");
			double base = scn.nextFloat();
			
			System.out.print("Enter the value of height: ");
			double height = scn.nextFloat();
			
			double triangle = 0.5f*(base*height);
			
			System.out.println("The area of triangle with base "+base+" and "+"height "+height+" : "+triangle);
		}else {
			System.out.println("Invalid Command");
		}
		scn.close();
	}
}
