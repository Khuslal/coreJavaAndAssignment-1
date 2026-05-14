package array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		// Store and print age of five students
		
		// Create array
		int age[] = new int [3];
		// Write data in array
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<age.length; i++) {
			System.out.println("Enter age : ");
			age[i] = scn.nextInt();
		}
		scn.close();
		// Read data from array
		// System.out.println(age[0]);
		// Read data using for each loop
		for(int x : age) {
			System.out.println("The age is "+x);
		}

	}
}
