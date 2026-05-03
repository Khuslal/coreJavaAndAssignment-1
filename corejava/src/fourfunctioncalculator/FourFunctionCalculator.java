package fourfunctioncalculator;

import java.util.Scanner;

public class FourFunctionCalculator {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// Taking User Input
		System.out.println("Enter the value of a: ");
		int a = scn.nextInt();
		System.out.println("Select one operator from '+,-,*,/' : ");
		char op = scn.next().charAt(0);
		System.out.println("Enter the value of b: ");
		int b = scn.nextInt();

		scn.close();
		// Calling Functions
		if (op == '+') {
			System.out.println(a + " + " + b + " = " + add(a, b));
		} else if (op == '-') {
			System.out.println(a + " - " + b + " = " + sub(a, b));
		} else if (op == '*') {
			System.out.println(a + " * " + b + " = " + mul(a, b));
		} else if (op == '/') {
			System.out.println(a + " / " + b + " = " + div(a, b));
		}

	}

	// Using Functions With If else Statements

	static int add(int a, int b) {
		int add = a + b;
		return add;
	}

	static int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	static int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	static int div(int a, int b) {
		int div = a / b;
		return div;
	}

}
