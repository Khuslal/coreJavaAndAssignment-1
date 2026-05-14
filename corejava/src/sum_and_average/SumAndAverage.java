package sum_and_average;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b;
		System.out.print("Enter 1st number: ");
		a = scn.nextInt();

		System.out.print("Enter 2nd number: ");
		b = scn.nextInt();
		scn.close();

		int sum = a + b;
		System.out.println("The sum of a and b : " + sum);

		float val1 = a;
		float val2 = b;
		float average = (val1 + val2) / 2;
		System.out.println("The average of a and b: " + average);
	}
}
