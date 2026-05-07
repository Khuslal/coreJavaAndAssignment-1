package complexNumber;

import java.util.Scanner;

public class Complex {

	double a1, b1, a2, b2;
	Scanner scn = new Scanner(System.in);

	public void UserInput() {
		System.out.println("Enter the value of a1 : ");
		a1 = scn.nextDouble();
		System.out.println("Enter the value of b1 : ");
		b1 = scn.nextDouble();
		System.out.println("Enter the value of a2 : ");
		a2 = scn.nextDouble();
		System.out.println("Enter the value of b2 : ");
		b2 = scn.nextDouble();

	}

	public void sum() {
		// Using formula (a1+b1i)+(a2+b2i) = (a1+a2)+(b1+b2)i
		double realSum = a1 + a2;
		double imagSum = b1 + b2;
		System.out.println("Using formula (a1+b1i)+(a2+b2i) = (a1+a2)+(b1+b2)i");
		System.out.println("Sum: " + realSum + " + " + imagSum + "i");
	}

	public void difference() {
		// Using formula (a1+b1i)-(a2+b2i) = (a1-a2)+(b1-b2)i
		double realDiff = a1 - a2;
		double imagDiff = b1 - b2;
		System.out.println("Using formula (a1+b1i)-(a2+b2i) = (a1-a2)+(b1-b2)i");
		System.out.println("Difference: " + realDiff + " + (" + imagDiff + "i)");
	}

	public void product() {
		// Using Formula: (a1+b1i)(a2+b2i) = a1a2+a1b2i+a2b1i-b1b2 (i.e. i^2 = -1 so,
		// +b1b2i^2 becomes -b1b2);
		double realProd = (a1 * a2) - (b1 * b2);
		double imagProd = (a1 * b2) + (a2 * b1);
		System.out.println("Using Formula: (a1+b1i)(a2+b2i) = (a1a2 - b1b2) + (a1b2 + a2b1)i");
		System.out.println("Product: " + realProd + " + " + imagProd + "i");
	}
}