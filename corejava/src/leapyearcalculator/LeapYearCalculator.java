package leapyearcalculator;

import java.time.Year;
import java.util.Scanner;

public class LeapYearCalculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the year to check whether it is a leap year or not : ");
		int Year = scn.nextInt() ;
		
		if(Year > 0) {
			if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0) ){
				System.out.println(Year+" is Leap Year ");
			}else {
				System.out.println(Year+ " is not Leap Year");
			}
		}else {
			System.out.println("Invalid Command !");
		}	
	}
}
