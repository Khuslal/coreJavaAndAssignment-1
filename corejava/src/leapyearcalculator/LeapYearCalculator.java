package leapyearcalculator;

import java.util.Scanner;

public class LeapYearCalculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the year to check whether it is a leap year or not : ");
		int year = scn.nextInt();

		if (year > 0) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(year + " is Leap Year ");
			} else {
				System.out.println(year + " is not Leap Year");
			}
		} else {
			System.out.println("Invalid Command !");
		}
		scn.close();
	}
}
