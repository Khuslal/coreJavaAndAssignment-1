package array;

import java.util.Scanner;

public class StoreAndPrintNameOfCities {
	public static void main(String[] args) {
		String cities[] = new String[6];
		// Scanner initialized
		Scanner scn = new Scanner(System.in);
		// For Loop to store the data
		for (int i = 0; i < cities.length; i++) {
			System.out.println("Enter the name of city " + i + " : ");
			cities[i] = scn.next(); //stores the data inside array
		}
		scn.close();
		// For Each Loop to fetch the data
		for (String x : cities) {
			System.out.println(x);
		}
	}
}
