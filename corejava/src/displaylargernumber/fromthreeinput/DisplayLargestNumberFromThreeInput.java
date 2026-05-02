package displaylargernumber.fromthreeinput;

import java.util.Scanner;

public class DisplayLargestNumberFromThreeInput {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the first no. : ");
		int num1 = scn.nextInt();

		System.out.println("Enter the second no. : ");
		int num2 = scn.nextInt();

		System.out.println("Enter the third no. : ");
		int num3 = scn.nextInt();

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is the largest number from " + num1 + " " + num2 + " and " + num3);
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " is the largest number from " + num1 + " " + num2 + " and " + num3);
		} else if ((num1 == num2) && (num1 > num3)) {
			System.out.println("Both " + num1 + " and " + num2 + " are equal and greater than " + num3);
		} else if ((num1 == num3) && (num1 > num2)) {
			System.out.println("Both " + num1 + " and " + num3 + " are equal and greater than " + num2);
		} else if ((num2 == num3) && (num2 > num1)) {
			System.out.println("Both " + num2 + " and " + num3 + " are equal and greater than " + num1);
		} else if ((num1 == num2) && (num1 == num3) && (num2 == num3)) {
			System.out.println("All three numbers are equal.");
		} else {
			System.out.println(num3 + " is the largest number from " + num1 + " " + num2 + " and " + num3);
		}
	}
}
