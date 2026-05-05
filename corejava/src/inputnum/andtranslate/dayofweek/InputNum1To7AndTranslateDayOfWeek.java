package inputnum.andtranslate.dayofweek;

import java.util.Scanner;

public class InputNum1To7AndTranslateDayOfWeek {
	public static void main(String[] args) {
		String days [] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to display day : ");
		int day = scn.nextInt();
		
		switch(day) {
		case 1:
			String day1 = days[0];
			System.out.println(day1);
			break;
		case 2:
			String day2 = days[1];
			System.out.println(day2);
			break;
		case 3:
			String day3 = days[2];
			System.out.println(day3);
			break;
		case 4:
			String day4 = days[3];
			System.out.println(day4);
			break;
		case 5:
			String day5 = days[4];
			System.out.println(day5);
			break;
		case 6:
			String day6 = days[5];
			System.out.println(day6);
			break;
		case 7:
			String day7 = days[6];
			System.out.println(day7);
			break;
		default :
			System.out.println("Invalid Command !");
		}
	}
}
