package methods;

import java.util.Scanner;

public class MethodsDocs {
	public static void main(String[] args) {

//		sum();
//		printTable(23);

//		int sv = getSmallest(4, 6); // sv= smallest value
//		System.out.println("Smallest Value : " + sv);
		
		System.out.println("The sum of 1-100 : "+ getSumof1to100());
	}
	
	// ========Method / Function===========
	/*
	 * # Use for code re-usability # Lines or block of code which is use to perform
	 * some specific task in the program. # Syntax: return_type method_name (arg1,
	 * arg2, .argn) { // statements }
	 */
//	1. no return type with no arguments

	static void sum() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = scn.nextInt();
		System.out.println("Enter the value of a : ");
		int b = scn.nextInt();
		int c = a + b;
		System.out.println("Total = " + c);
	}

	// 2. no return type with arguments

	static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	// 3. return type with arguments

	static int getSmallest(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
// 4. return type with no arguments
	static int getSumof1to100() {
		int s = 0;
		for(int i = 1; i<=100; i++) {
			s += i;
		}
		return s;
	}
}
