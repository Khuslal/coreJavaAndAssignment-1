package fahrenheit_to_celsius;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
//		==========Fahrenheit to Celsius Conversion===============
		System.out.println("Enter Fahrenheit: ");
		double f = scn.nextDouble();
		double c = (f-32)/1.8;
		System.out.println(f+"°F = "+c+"°C");
		
//		===========Celsius to Fahrenheit Conversion==============
		System.out.println("Enter Celsius: ");
		double celsius = scn.nextDouble();
		double fahrenheit = (celsius*1.8)+32;
		System.out.println(celsius+"°C = "+fahrenheit+"°F");
		scn.close();
	}
}
