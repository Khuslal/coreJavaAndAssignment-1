package displaytrianglestype;

import java.util.Scanner;

public class DisplayTrianglesType {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = scn.nextInt();
		System.out.println("Enter value of b : ");
		int b = scn.nextInt();
		System.out.println("Enter value of c : ");
		int c = scn.nextInt();
		
		if(a == b && b == c) {
			System.out.println("The triangle is Equilateral Triangle.");
		}else if(a==b || b==c) {
			System.out.println("The triangle is Isosceles Triangle.");
		}else {
			System.out.println("The triangle is Scalene Triangle.");
		}
	}
}
