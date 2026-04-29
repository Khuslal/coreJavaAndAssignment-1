package pounds_to_kg;

import java.util.Scanner;

public class PoundsToKg {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter pound: ");
		double pound = scn.nextDouble();
		
		double kg = 0.45359238095*pound; // pound to kg;
		String result = String.format("%.4f", kg);
		System.out.println(pound+" = "+result+" kg");
	}
}
