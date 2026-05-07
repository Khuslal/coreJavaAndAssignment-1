package inchfeet;

import java.util.Scanner;

public class AddDistance {
	Scanner scn = new Scanner(System.in);
	int num1, num2, distance, inch, feet;

	public void Distance() {
		System.out.println("Enter the 1st value in inch : ");
		num1 = scn.nextInt();

		System.out.println("Enter the 2nd value in inch : ");
		num2 = scn.nextInt();
		distance = num1 + num2;

		feet = distance/12;
		inch = distance%12;
		System.out.println("Distance : "+feet+" feet "+inch+" inch");
	}

}
